
public class Demo {
	public Object data;

	public Demo(Object data) {
		super();
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		
		Demo d1=new Demo(101);
		Demo d2=new Demo("abc");
		Demo d3=new Demo(567);
		Demo d4=new Demo("pqr");
		System.out.println(d1.getData());
		System.out.println(d2.getData());
		System.out.println(d3.getData());
		int temp=(int)d1.getData()+(int)d3.getData();
		System.out.println((String)d2.getData()+(String)d4.getData());
		
		System.out.println(temp);
	}

}
