
public class NewDemo<Z> {
	private Z data;

	
	public NewDemo(Z data) {
		super();
		this.data = data;
	}

	public Z getData() {
		return data;
	}

	public void setData(Z data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		NewDemo<String> nd1=new NewDemo<String>("abc");
	
		System.out.println(nd1.getData());
		
		NewDemo<Integer> nd2=new NewDemo<Integer>(10);
		NewDemo<Integer> nd3=new NewDemo<Integer>(20);
		System.out.println(nd3.getData()+nd2.getData());
		
		
	}
}
