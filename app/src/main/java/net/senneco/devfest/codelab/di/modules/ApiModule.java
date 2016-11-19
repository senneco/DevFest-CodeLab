package net.senneco.devfest.codelab.di.modules;

import net.senneco.devfest.codelab.presentation.model.network.GithubApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Date: 9/2/2016
 * Time: 18:54
 *
 * @author Artur Artikov
 */
@Module(includes = {RetrofitModule.class})
public class ApiModule {
	@Provides
	@Singleton
	public GithubApi provideAuthApi(Retrofit retrofit) {
		return retrofit.create(GithubApi.class);
	}
}
