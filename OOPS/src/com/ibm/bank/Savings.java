package com.ibm.bank;

public class Savings extends Account {
	private String	holder;
	public Savings() {
		// TODO Auto-generated constructor stub
	}
	public Savings(String holder) {
		super(holder,MIN_SAV_BAL);
	}
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		super.deposit(amount);
	}
	@Override
	public void withdraw(double amount) throws BalanceException {
		// TODO Auto-generated method stub
		if(amount<=balance-MIN_SAV_BAL) {
			balance-=amount;
			txns.add(new Transaction("DB", amount, balance));
		}
		else {
			throw new BalanceException("Insufficient balance");
		}
		
	}
	
	
}
