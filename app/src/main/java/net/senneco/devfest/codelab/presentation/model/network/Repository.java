package net.senneco.devfest.codelab.presentation.model.network;

import java.io.Serializable;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

/**
 * Date: 18.01.2016
 * Time: 12:12
 *
 * @author Yuri Shmakov
 */
public class Repository implements Serializable {
	private static final long serialVersionUID = -4994763529881200165L;

	private int mId;
	private String mName;
	private String mFullName;
	private String mDescription;
	private String mUrl;
	private String mHtmlUrl;
	private transient User mOwner;
	@SerializedName("fork")
	private String mIsFork;
	@SerializedName("private")
	private String mIsPrivate;
	private Date mCreatedAt;
	private Date mUpdatedAt;
	private Date mPushedAt;
	private String mGitUrl;
	private String mSshUrl;
	private String mCloneUrl;
	private String mSvnUrl;
	private String mHomepage;
	private long mSize;
	@SerializedName("stargazers_count")
	private int mStarsCount;
	private int mWatchersCount;
	private String mLanguage;
	private boolean mHasIssues;
	private boolean mHasDownloads;
	private boolean mHasWiki;
	private int mForksCount;
	private int mOpenIssuesCount;
	private String mDefaultBranch;

	public int getId() {
		return mId;
	}

	public void setId(int id) {
		mId = id;
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		mName = name;
	}

	public String getFullName() {
		return mFullName;
	}

	public void setFullName(String fullName) {
		mFullName = fullName;
	}

	public String getDescription() {
		return mDescription;
	}

	public void setDescription(String description) {
		mDescription = description;
	}

	public String getUrl() {
		return mUrl;
	}

	public void setUrl(String url) {
		mUrl = url;
	}

	public String getHtmlUrl() {
		return mHtmlUrl;
	}

	public void setHtmlUrl(String htmlUrl) {
		mHtmlUrl = htmlUrl;
	}

	public User getOwner() {
		return mOwner;
	}

	public void setOwner(User owner) {
		mOwner = owner;
	}

	public String isFork() {
		return mIsFork;
	}

	public void setIsFork(String isFork) {
		mIsFork = isFork;
	}

	public String getIsPrivate() {
		return mIsPrivate;
	}

	public void setIsPrivate(String isPrivate) {
		mIsPrivate = isPrivate;
	}

	public Date getCreatedAt() {
		return mCreatedAt;
	}

	public void setCreatedAt(Date createdAt) {
		mCreatedAt = createdAt;
	}

	public Date getUpdatedAt() {
		return mUpdatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		mUpdatedAt = updatedAt;
	}

	public Date getPushedAt() {
		return mPushedAt;
	}

	public void setPushedAt(Date pushedAt) {
		mPushedAt = pushedAt;
	}

	public String getGitUrl() {
		return mGitUrl;
	}

	public void setGitUrl(String gitUrl) {
		mGitUrl = gitUrl;
	}

	public String getSshUrl() {
		return mSshUrl;
	}

	public void setSshUrl(String sshUrl) {
		mSshUrl = sshUrl;
	}

	public String getCloneUrl() {
		return mCloneUrl;
	}

	public void setCloneUrl(String cloneUrl) {
		mCloneUrl = cloneUrl;
	}

	public String getSvnUrl() {
		return mSvnUrl;
	}

	public void setSvnUrl(String svnUrl) {
		mSvnUrl = svnUrl;
	}

	public String getHomepage() {
		return mHomepage;
	}

	public void setHomepage(String homepage) {
		mHomepage = homepage;
	}

	public long getSize() {
		return mSize;
	}

	public void setSize(long size) {
		mSize = size;
	}

	public int getStarsCount() {
		return mStarsCount;
	}

	public void setStarsCount(int starsCount) {
		mStarsCount = starsCount;
	}

	public int getWatchersCount() {
		return mWatchersCount;
	}

	public void setWatchersCount(int watchersCount) {
		mWatchersCount = watchersCount;
	}

	public String getLanguage() {
		return mLanguage;
	}

	public void setLanguage(String language) {
		mLanguage = language;
	}

	public boolean isHasIssues() {
		return mHasIssues;
	}

	public void setHasIssues(boolean hasIssues) {
		mHasIssues = hasIssues;
	}

	public boolean isHasDownloads() {
		return mHasDownloads;
	}

	public void setHasDownloads(boolean hasDownloads) {
		mHasDownloads = hasDownloads;
	}

	public boolean isHasWiki() {
		return mHasWiki;
	}

	public void setHasWiki(boolean hasWiki) {
		mHasWiki = hasWiki;
	}

	public int getForksCount() {
		return mForksCount;
	}

	public void setForksCount(int forksCount) {
		mForksCount = forksCount;
	}

	public int getOpenIssuesCount() {
		return mOpenIssuesCount;
	}

	public void setOpenIssuesCount(int openIssuesCount) {
		mOpenIssuesCount = openIssuesCount;
	}

	public String getDefaultBranch() {
		return mDefaultBranch;
	}

	public void setDefaultBranch(String defaultBranch) {
		mDefaultBranch = defaultBranch;
	}
}