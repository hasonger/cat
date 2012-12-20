/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.noday.core.model;

import java.io.Serializable;

/**
 * cat App
 *
 * @author <a href="http://www.noday.net">Noday</a>
 * @version , 2012-11-24
 * @since 
 */
public class App implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String version;
	private String webTitle;
	private String subTitle;
	private String hostUrl;
	private String metaKeywords;
	private String metaDescription;
	private String boardSource;
	private String hiddenSource;
	private String skin;
	private int recentArticles;
	private int mostViewArticles;
	private int mostReplyArticles;
	private int recentComments;
	private int mostUsedTags;
	private int listArticles;
	private int listStyle;
	private boolean registable;
	private boolean commentable;

	public String getVersion() {
		return version;
	}
	public App setVersion(String version) {
		this.version = version;
		return this;
	}
	public String getWebTitle() {
		return webTitle;
	}
	public App setWebTitle(String webTitle) {
		this.webTitle = webTitle;
		return this;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public App setSubTitle(String subTitle) {
		this.subTitle = subTitle;
		return this;
	}
	public String getHostUrl() {
		return hostUrl;
	}
	public App setHostUrl(String hostUrl) {
		this.hostUrl = hostUrl;
		return this;
	}
	public String getMetaKeywords() {
		return metaKeywords;
	}
	public App setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
		return this;
	}
	public String getMetaDescription() {
		return metaDescription;
	}
	public App setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
		return this;
	}
	public String getBoardSource() {
		return boardSource;
	}
	public App setBoardSource(String boardSource) {
		this.boardSource = boardSource;
		return this;
	}
	public String getHiddenSource() {
		return hiddenSource;
	}
	public App setHiddenSource(String hiddenSource) {
		this.hiddenSource = hiddenSource;
		return this;
	}
	public String getSkin() {
		return skin;
	}
	public App setSkin(String skin) {
		this.skin = skin;
		return this;
	}
	public int getRecentArticles() {
		return recentArticles;
	}
	public App setRecentArticles(int recentArticles) {
		this.recentArticles = recentArticles;
		return this;
	}
	public int getMostViewArticles() {
		return mostViewArticles;
	}
	public App setMostViewArticles(int mostViewArticles) {
		this.mostViewArticles = mostViewArticles;
		return this;
	}
	public int getMostReplyArticles() {
		return mostReplyArticles;
	}
	public App setMostReplyArticles(int mostReplyArticles) {
		this.mostReplyArticles = mostReplyArticles;
		return this;
	}
	public int getRecentComments() {
		return recentComments;
	}
	public App setRecentComments(int recentComments) {
		this.recentComments = recentComments;
		return this;
	}
	public int getMostUsedTags() {
		return mostUsedTags;
	}
	public App setMostUsedTags(int mostUsedTags) {
		this.mostUsedTags = mostUsedTags;
		return this;
	}
	public int getListArticles() {
		return listArticles;
	}
	public App setListArticles(int listArticles) {
		this.listArticles = listArticles;
		return this;
	}
	public int getListStyle() {
		return listStyle;
	}
	public App setListStyle(int listStyle) {
		this.listStyle = listStyle;
		return this;
	}
	public boolean isRegistable() {
		return registable;
	}
	public App setRegistable(boolean registable) {
		this.registable = registable;
		return this;
	}
	public boolean isCommentable() {
		return commentable;
	}
	public App setCommentable(boolean commentable) {
		this.commentable = commentable;
		return this;
	}
}
