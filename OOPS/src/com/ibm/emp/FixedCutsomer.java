package com.ibm.emp;

public class FixedCutsomer extends Customer {
	private double fdiscount;

	public FixedCutsomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FixedCutsomer(String custName, double creditLimit,double fdiscount) {
		super(custName, creditLimit);
		// TODO Auto-generated constructor stub
		this.fdiscount=fdiscount;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("Discount:"+fdiscount+" %");
	}
	
	

}
