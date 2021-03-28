package com.ibm.SocialMedia;

public class Dashboard {
	private Post[] posts;
	private int idx;
	public Dashboard() {
		System.out.println("Dashboard created ");
		this.posts=new Post[20];
		idx=0;
		//System.out.println("***id:"+idx);
	}

	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public void addPost(Post post) {
		//System.out.println("****enterd");
		if(idx<=30 &&idx>=0) {
			posts[idx++]=post;
		}
		else {
			System.out.println("dashboard is full");
		}
	}
	public void display() {
		if(idx==0) {
			System.out.println("Dashboard is empty:");
		}
		else {
			System.out.println("Details of Dashboard are:-");
			for(int i=0;i<idx;i++) {
				posts[i].showPost();
			}
		}
	}
}
