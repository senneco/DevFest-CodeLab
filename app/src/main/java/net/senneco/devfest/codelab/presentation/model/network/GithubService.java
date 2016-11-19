package net.senneco.devfest.codelab.presentation.model.network;

import java.util.List;

import io.reactivex.Single;

/**
 * Date: 20.09.2016
 * Time: 20:14
 *
 * @author Yuri Shmakov
 */

public class GithubService {

	private GithubApi mGithubApi;

	public GithubService(GithubApi githubApi) {
		mGithubApi = githubApi;
	}

	public Single<User> signIn(String token) {
		return mGithubApi.signIn(token);
	}

	public Single<List<Repository>> getUserRepos(String user, int page, int pageSize) {
		return mGithubApi.getUserRepos(user, page, pageSize);
	}
}
