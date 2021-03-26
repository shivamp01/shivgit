import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {
	
	public static void main(String[] args) {
		LocalDate d1=LocalDate.now();
		System.out.println(d1);
		
		LocalDate d2=LocalDate.of(2012, 02, 21);
		System.out.println(d2);
		
		LocalDate d3=LocalDate.parse("2020-02-19");
		System.out.println(d3);
		
		System.out.println(d1.plusDays(1));
		System.out.println(d1.minus(1, ChronoUnit.MONTHS));
		System.out.println(d2.getDayOfMonth());
		System.out.println(d3.getDayOfWeek());
		System.out.println(d2.isLeapYear());
		System.out.println(d1.getMonth());
	}

}
