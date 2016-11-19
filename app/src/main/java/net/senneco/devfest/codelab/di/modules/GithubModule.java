package net.senneco.devfest.codelab.di.modules;

import net.senneco.devfest.codelab.presentation.model.network.GithubApi;
import net.senneco.devfest.codelab.presentation.model.network.GithubService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Date: 8/26/2016
 * Time: 11:58
 *
 * @author Artur Artikov
 */

@Module(includes = {ApiModule.class})
public class GithubModule {
	@Provides
	@Singleton
	public GithubService provideGithubService(GithubApi authApi) {
		return new GithubService(authApi);
	}
}