package net.senneco.devfest.codelab.di.modules;

import java.lang.reflect.Field;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import net.senneco.devfest.codelab.presentation.model.network.AuthorizationInterceptor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Date: 8/26/2016
 * Time: 12:28
 *
 * @author Artur Artikov
 */
@Module
public class RetrofitModule {
	@Provides
	@Singleton
	Retrofit provideRetrofit() {
		return getRetrofitBuilder().baseUrl("https://api.github.com").build();
	}

	private Retrofit.Builder getRetrofitBuilder() {
		return new Retrofit.Builder()
				.client(getOkHttpClient())
				.addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
				.addConverterFactory(getConverterFactory());
	}

	private OkHttpClient getOkHttpClient() {
		return new OkHttpClient.Builder()
					.addInterceptor(new AuthorizationInterceptor())
					.addInterceptor(getHttpLoggingInterceptor())
					.build();
	}

	private HttpLoggingInterceptor getHttpLoggingInterceptor() {
		HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
		interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
		return interceptor;
	}

	private Converter.Factory getConverterFactory() {
		return GsonConverterFactory.create(getGson());
	}

	private Gson getGson() {
		return new GsonBuilder()
				.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
				.setFieldNamingStrategy(new CustomFieldNamingPolicy())
				.setPrettyPrinting()
				.setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
				.serializeNulls()
				.create();
	}

	private static class CustomFieldNamingPolicy implements FieldNamingStrategy {
		@Override
		public String translateName(Field field) {
			String name = FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES.translateName(field);
			name = name.substring(2, name.length()).toLowerCase();
			return name;
		}
	}
}
