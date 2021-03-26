
public class TestAB {
	public static void main(String[] args) {
		Alpha a=new Alpha();
		a.demo();
		
		Beta b=new Beta();
		b.test();
		
		Alpha ab=b;
		ab.demo();
		//ab.test();
		
		Beta ba=(Beta)ab;
		ba.test();
		ba.demo();
	}

}
