package com.shopping.model;

public class Category {
	
	private String shortcode;
	private int likes;
	private int comment;
	private int timestamp;
	@Override
	
	public String toString() {
		return "instagram [shortcode=" + shortcode + ", likes=" + likes + ", comment=" + comment + ", timestamp="
				+ timestamp + "]";
	}
	
	public Category() {
		super();
	}
	
	public Category(String shortcode, int likes, int comment, int timestamp) {
		super();
		this.shortcode = shortcode;
		this.likes = likes;
		this.comment = comment;
		this.timestamp = timestamp;
	}
	public String getShortcode() {
		return shortcode;
	}
	public void setShortcode(String shortcode) {
		this.shortcode = shortcode;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getComment() {
		return comment;
	}
	public void setComment(int comment) {
		this.comment = comment;
	}
	public int getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
