import com.ibm.xe.*;

public class TestCurrency {
	public static void main(String[] args) {
		CurrencyConverter cr=new CurrencyConverter();
		INR inr=new INR();
		USD usd=new USD();
		UKP ukp=new UKP();
		System.out.println(cr.convert(inr	, usd, 100));
		System.out.println(cr.convert(usd	, inr, 100));
		
		System.out.println(cr.convert(ukp, usd, 1));
		System.out.println(cr.convert(ukp, inr, 10));
	}
}
