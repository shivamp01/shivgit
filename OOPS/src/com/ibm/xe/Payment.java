package com.ibm.xe;

public class Payment {
	private int accNo;
	private double balance;
	public Payment() {
		// TODO Auto-generated constructor stub
	}
	public Payment(int accNo, double balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
