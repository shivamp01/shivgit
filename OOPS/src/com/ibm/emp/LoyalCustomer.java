package com.ibm.emp;

public class LoyalCustomer extends Customer {
	private double discount;

	public LoyalCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoyalCustomer(String custName, double creditLimit, double discount) {
		super(custName, creditLimit);
		// TODO Auto-generated constructor stub
		this.discount=discount;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("Discount:"+discount+" %");
	}
	
	
	
}
