package net.senneco.devfest.codelab.presentation.model.network;

import java.util.List;

import net.senneco.devfest.codelab.presentation.model.network.gson.SearchResult;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Date: 18.01.2016
 * Time: 12:07
 *
 * @author Yuri Shmakov
 */
public interface GithubApi {
	Integer PAGE_SIZE = 50;

	@GET("/user")
	Single<User> signIn(@Header("Authorization") String token);

	@GET("/search/repositories?sort=stars&order=desc")
	Single<SearchResult> search(@Query("q") String query);

	@GET("/users/{login}/repos")
	Single<List<Repository>> getUserRepos(@Path("login") String login, @Query("page") int page, @Query("per_page") int pageSize);
}
