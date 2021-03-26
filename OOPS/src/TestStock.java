import com.ibm.stock.Broker;
import com.ibm.stock.Exchange;
import com.ibm.stock.Holder;
import com.ibm.stock.Stock;
import com.ibm.stock.StockSingleton;

public class TestStock {
	public static void main(String[] args) {
		
		//Stock ibm=new Stock();
		Holder h=StockSingleton.getStock();
		Broker b=StockSingleton.getStock();
		Exchange e=StockSingleton.getStock();
		h.view();
		b.view();
		b.get();
		e.view();
		e.get();
		e.set();
		System.out.println(h==b);
		System.out.println(h==e);
		
	}
}
