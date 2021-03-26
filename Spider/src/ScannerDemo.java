import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		
		System.out.print("Enter name   :");
		String name=console.next();
		String namePattern="[A-Z][a-z]{3,}";
		
		System.out.println("name is"+(name.matches(namePattern)?"valid":"invalid"));
		
		System.out.println("Enter mobile number");
		String mob=console.next();
		String mobpat="[7-9][0-9]{9}";
		System.out.println("Mobile number is"+(mob.matches(mobpat)?"valid":"invalid"));
		
		System.out.println("Enter age");
		String age=console.next();
		String agepat="[0-9]{2}";
		System.out.println("Age is"+(age.matches(agepat)?"valid":"invalid"));
		
		
		console.close();
	}
}
