package com.ibm.bank;
/**
 * This class represents generalized banking account
 * @author Shivam
 * @version 1.0
 *
 */

import java.util.Vector;

public abstract class  Account implements Banking {
	private int accNo;
	private String holder;
	protected double balance;
	public static int autogen;
	
	//Application constants
	public static final int INIT_ACC_NO=1001;
	public static final double MIN_SAV_BAL=1000;
	public static final double OD_LIMIT=10000;
	public static final double INIT_CUR_BAL=5000;
	public static final double MIN_CUR_BAL=0;
	
	protected  Vector<Transaction> txns;
	//protected int idx;
	static {
		autogen=INIT_ACC_NO;
	}
	
	/*This is default constructor*/
	public Account() {
	
	}
	/*This is param constructor*/
	public Account(String holder, double balance) {
		super();
		this.accNo = autogen++;
		this.holder = holder;
		this.balance = balance;
		txns=new Vector<Transaction>();
		txns.add(new Transaction("OB", balance, balance));
	}
	
	public void deposit(double amount) {
		balance=balance+amount;
		txns.add(new Transaction("CR", amount, balance));
		
	}
	
	public abstract void  withdraw(double amount) throws BalanceException;
	
	public void statement() {
		System.out.println("Statement for A/C"+accNo);
		for(int i=0;i<txns.size();i++) {
			txns.get(i).print();
		}
	}
	
	public void summary() {
		System.out.println("Account number="+accNo+"\nAccount holder:"+holder+"\nBalance:"+balance);
	}

}
