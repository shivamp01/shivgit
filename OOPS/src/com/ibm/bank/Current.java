package com.ibm.bank;

public class Current extends Account {
	private double overdraft;
	public Current() {
		// TODO Auto-generated constructor stub
	}

	public Current(String holder) {
		super(holder, INIT_CUR_BAL);
		// TODO Auto-generated constructor stub
		this.overdraft=OD_LIMIT;
	}

	@Override
	public void withdraw(double amount) throws BalanceException {	
		if(amount<balance+overdraft) {
			balance-=amount;
			if(balance<MIN_CUR_BAL) {
				overdraft+=balance;
				balance=MIN_CUR_BAL;
			}
			
		}else {
			throw new BalanceException("Insufficient balance");
		}
	}

	@Override
	public void deposit(double amount) {
		overdraft+=amount;
		if(overdraft>OD_LIMIT) {
			balance+=overdraft-OD_LIMIT;
			overdraft=OD_LIMIT;
		}
	}

	@Override
	public void summary() {
		// TODO Auto-generated method stub
		super.summary();
		System.out.println("Over draft="+overdraft);
	}
	

}
