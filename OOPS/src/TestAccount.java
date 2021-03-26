import com.ibm.bank.*;
public class TestAccount {
	public static void main(String[] args) {
	//	Account a1=new Account("shivam",1000);
		//to deposit
		//a1.deposit(5000);
		//to withdraw
	//a1.summary();
		//a1.withdraw(15000);
		//a1.withdraw(2000);
		//a1.summary();
		
	//	Savings s1=new Savings("Shivam");
		//s1.withdraw(1000);
		//s1.summary();
	
//		Account c1=new Current("sk");
//		c1.summary();
//		c1.withdraw(3000);
//		c1.summary();
//		c1.withdraw(7000);
//		c1.summary();
//		c1.deposit(2000);
//		c1.summary();
//		c1.deposit(4000);
//		c1.summary();
		Banking s1=AccountFactory.openSavingsAccount("POLO");
		s1.deposit(1000000);
		try {
			s1.withdraw(10);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	//used for debugging-user: developers
		}
		try {
			s1.withdraw(1000000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
		//System.out.println(e);  		//for system/application audit-User:loggers
		System.out.println(e.getMessage());  //for end users
		}
		s1.statement();

	}

}

