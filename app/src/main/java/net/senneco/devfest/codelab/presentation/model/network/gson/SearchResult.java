package net.senneco.devfest.codelab.presentation.model.network.gson;

import java.util.List;

import net.senneco.devfest.codelab.presentation.model.network.Repository;

/**
 * Date: 18.01.2016
 * Time: 12:13
 *
 * @author Yuri Shmakov
 */
public class SearchResult {
	private int mTotalCount;
	private boolean mIncompleteResults;
	private List<Repository> mItems;

	public List<Repository> getRepositories() {
		return mItems;
	}
}