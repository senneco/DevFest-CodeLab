package net.senneco.devfest.codelab.presentation.model.network;

import java.io.IOException;

import android.text.TextUtils;

import net.senneco.devfest.codelab.utils.common.AuthUtils;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by senneco on 20.11.2016
 */

public class AuthorizationInterceptor implements Interceptor {

	private static final String HEADER_AUTHORIZATION = "Authorization";
	private static final String HEADER_AUTHORIZATION_NOT_REQUIRED = "not_required";
	public static final String NON_AUTHORIZED_METHOD = HEADER_AUTHORIZATION + ": " + HEADER_AUTHORIZATION_NOT_REQUIRED;

	@Override
	public Response intercept(Chain chain) throws IOException {
		Request originalRequest = chain.request();

		Request request = originalRequest;

		String token = AuthUtils.getToken();

		String authorizationHeader = originalRequest.header(HEADER_AUTHORIZATION);

		if (authorizationHeader != null && authorizationHeader.equals(HEADER_AUTHORIZATION_NOT_REQUIRED)) {
			request = originalRequest.newBuilder().removeHeader(HEADER_AUTHORIZATION).build();
		} else if(!TextUtils.isEmpty(token)) {
			request = originalRequest.newBuilder().header(HEADER_AUTHORIZATION, token).build();
		}

		return chain.proceed(request);
	}
}