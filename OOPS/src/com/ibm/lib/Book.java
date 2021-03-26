package com.ibm.lib;

public class Book {
	private int isbn;
	private String title;
	private Member member;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(int isbn, String title) {
		super();
		this.isbn = isbn;
		this.title = title;
	}
	public void status() throws LibraryException {
		if(member==null)
			throw new LibraryException(title+"is not issued to any member");
		else
			throw new LibraryException(title+"is issued to "+member.getName());
				
	}
	public void issueBook(Member mbr) throws LibraryException {
		if(member!=null) {
			throw new LibraryException(title+"is already issued by "+member.getName());
		}
		else if(mbr.getBook()!=null) {
			throw new LibraryException(mbr.getName()+" has already issued the book");
		}
		else{
			this.member=mbr;
			mbr.setBook(this);
		}
		
	}
	public void returnBook(Member mbr) throws LibraryException {
		if(member==null) {
			throw new LibraryException(title+" is not issued to any member");
		}
		else if(mbr.getBook()==null) {
			throw new LibraryException(mbr.getName()+" has not issued any book");
		}
		else if(!mbr.getName().equals(member.getName())) {
			//System.out.println("****");
			throw new LibraryException(title+" is not issued to "+mbr.getName());
		}
		else {
		this.member=null;
		mbr.setBook(null); 
		}
		
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

}
