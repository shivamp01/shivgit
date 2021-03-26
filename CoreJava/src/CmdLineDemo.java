
public class CmdLineDemo {
	public static void main(String[] args) {
		//for(String arg:args) {
			//System.out.println(arg);
		//}
		int sum=0;
		for (String num : args) {
			sum+=Integer.parseInt(num);
		}
		System.out.println(sum);
		
		//java supports auto boxing feature 
		int x=10;
		Integer xo=x;	//boxing
		Integer xc=50;
		
		int sum1=xo+xc+x;	//unboxing
		System.out.println(sum1);
	}

}
