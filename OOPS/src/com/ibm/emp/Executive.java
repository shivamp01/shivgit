package com.ibm.emp;

public class Executive extends Employee {
	private double commission;

	public Executive() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Executive(String empName, double salary,double commission) {
		super(empName, salary);
		// TODO Auto-generated constructor stub
		this.commission=commission;
	}

	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("Commission is :"+commission);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+commission;
	}
	
	
	

}
