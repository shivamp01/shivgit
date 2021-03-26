
public class StaticDemo {
	private int data;
	private static int count;
	public StaticDemo(int data) {
		// TODO Auto-generated constructor stub
		this.data=data;
		count++;
	}
	public void print() {
		System.out.println("data:    "+data+"\tcount:"+count);
	}

	
	public static void main(String[] args) {
		StaticDemo s1=new StaticDemo(100);
		s1.print();
		StaticDemo s2=new StaticDemo(100);
		s2.print();
		StaticDemo s3=new StaticDemo(100);
		s3.print();
		
		s1.print();
	}
}
