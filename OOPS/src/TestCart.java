import com.ibm.xe.CartInvalidException;
import com.ibm.xe.OutOfStockException;
import com.ibm.xe.Payment;
import com.ibm.xe.PaymentException;
import com.ibm.xe.Product;
import com.ibm.xe.ShoppingCart;

public class TestCart {
	public static void main(String[] args) {
		Product p1=new Product("a",200, 3);
		Product p2=new Product("b",20,5);
		Product p3=new Product("c",30,3);
		Product p4=new Product("d",50,2);
		Product p5=new Product("e",50,1);
		Product p6=new Product("f",60,7);
		ShoppingCart sc=new ShoppingCart();
		try {
			sc.addProduct(p1);
		} catch (OutOfStockException | CartInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			sc.addProduct(p2);
		} catch (OutOfStockException | CartInvalidException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			sc.addProduct(p3);
		} catch (OutOfStockException | CartInvalidException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			sc.addProduct(p4);
		} catch (OutOfStockException | CartInvalidException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			sc.addProduct(p5);
		} catch (OutOfStockException | CartInvalidException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			sc.addProduct(p6);
		} catch (OutOfStockException | CartInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Payment pay1=new Payment(123, 1000);
		try {
			sc.checkOut(pay1,"HOLI200");
		} catch (PaymentException | CartInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
