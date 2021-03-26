package com.ibm.emp;

public class Manager extends Employee {
	private double incentives;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String empName, double salary,double incentives) {
		super(empName, salary);
		this.incentives=incentives;
	}

	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("Incentives:"+incentives);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+incentives;
	}
	
	
	
}
