@FunctionalInterface
public interface Currency {
	double dollarValue();
	
	public static double convert(Currency source, Currency target,double amount) {
		double rate=target.dollarValue()/source.dollarValue();
		return rate*amount;
	}
	static Currency INR=()->72.5;
	static Currency USD=()->1.0;
	
}
class Test{
	
	public static void main(String[] args) {
		System.out.println(Currency.convert(Currency.INR, Currency.USD, 100));
	}
}
