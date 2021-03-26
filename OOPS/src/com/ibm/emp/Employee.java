package com.ibm.emp;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	private static int autogen;
	
	static{
		System.out.println("Employee class is ready");
		autogen=1001;
		
	}
	
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	
	}
	public Employee(String empName, double salary) {
	
		this.empId = autogen++;
		this.empName = empName;
		this.salary = salary;
	}
	
	public void payslip() {
		// TODO Auto-generated method stub
		System.out.println("EmpId:"+this.empId+"\nEmpName:"+this.empName+"\nSalary:"+this.salary);

	}
	public double getSalary() {
		return salary;
	}
	
}
