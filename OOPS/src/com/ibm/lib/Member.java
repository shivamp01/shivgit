package com.ibm.lib;

public class Member {
	private int mid;
	private String name;
	private Book book;
	public Member() {
		// TODO Auto-generated constructor stub
	}
	public Member(int mid, String name) {
		super();
		this.mid = mid;
		this.name = name;
	}
	
	public void status() throws LibraryException {
		if(book==null)
			throw new LibraryException(name+"has not issued any book");
		else
			throw new LibraryException(name +" has issued "+book.getTitle());
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	

}
