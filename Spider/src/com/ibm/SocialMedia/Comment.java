package com.ibm.SocialMedia;

public class Comment {
	private User user;
	private String message;
	private int likes;
	private int dislikes;
	public Comment() {
	}
	public Comment(User user, String message) {
		this.user = user;
		this.message = message;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return user.getName()+"\t\t"+message+"\nLikes:"+likes+"\tDislikes:"+dislikes;
	}
	
	public void likeButton() {
		likes+=1;
	}
	public void dislikeButton() {
		dislikes+=1;
	}
	
}
