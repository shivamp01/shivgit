package com.ibm.emp;

public class Customer {
	private int custId;
	private String custName;
	private double creditLimit;
	private static int autogen;
	
	static {
		autogen=101;
		
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String custName, double creditLimit) {
	
		this.custId = autogen++;
		this.custName = custName;
		this.creditLimit = creditLimit;
	}
	public void print() {
		System.out.println("Customer Id:"+this.custId+"\nCustomer Name:"+custName+"\nCredit Limit:"+this.creditLimit);
	}
	
}
