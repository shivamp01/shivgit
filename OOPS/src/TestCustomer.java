import com.ibm.emp.Customer;
import com.ibm.emp.FixedCutsomer;
import com.ibm.emp.LoyalCustomer;

public class TestCustomer {
	public static void main(String[] args) {
		Customer c1=new Customer("abc",4000);
		c1.print();
		Customer c2=new Customer("b",5000);
		c2.print();
		
		LoyalCustomer lc1=new LoyalCustomer("aaa", 1000, 10);
		lc1.print();
		
		FixedCutsomer f1=new FixedCutsomer("bbb", 5000, 5);
		f1.print();
	}
}
