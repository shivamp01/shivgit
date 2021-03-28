package com.ibm.SocialMedia;

import java.time.LocalDate;

public class Post {
	private User user;
	private String content;
	private LocalDate postDate;
	private int likes;
	private int dislikes;
	private Comment comments[];
	private int idx;
	private Dashboard db;
	private String likestr;
	private String dislikestr;
	
	public Post() {
		System.out.println("default cons");
	}
	
	public Post(User user, String content, LocalDate postDate,Dashboard db) {
		//this();
		this.user = user;
		this.content = content;
		this.postDate = postDate;
		this.likes=0;
		this.dislikes=0;
		this.comments=new Comment[20];
		this.idx=0;
		this.dislikestr="";
		this.likestr="";
		
		this.db=db;
		db.addPost(this);
		//System.out.println("****post created ****");
	}

	public void likeButton(User u) {
		this.likes+=1;
		likestr+=u.getName()+",";
	}
	
	public void dislikeButton(User u) {
		this.dislikes+=1;
		dislikestr+=u.getName()+",";
	}
	public void showPost() {
		System.out.println("Details of Post are:");
		System.out.println("Content:\t"+content);
		System.out.println("Date of post:\t"+postDate);
		System.out.println("Likes:\t"+likes+"\t"+likestr);
		System.out.println("Dislikes:\t"+dislikes+"\t"+dislikestr);
		System.out.println("Comments ->->");
		for (int i=0;i<idx;i++) {
			System.out.println(comments[i].toString());
		}
	}
	public void addComent(Comment cmt) {
		if(idx>=0&&idx<20) {
			comments[idx++]=cmt;
			//System.out.println("**"+idx);
		}else {
			System.out.println("Comments cannot be added");
		}
		
	}
}
