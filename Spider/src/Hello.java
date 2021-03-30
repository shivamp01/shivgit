@FunctionalInterface
public interface Hello {
	String sayHello();
	
	default void sayHola() {
		System.out.println("hola monde");
	}
	
	static void sayBonjor() {
		System.out.println("bonjor");
	}

}
class HelloDemo{
	public static void main(String[] args) {
		Hello h=()->"Hello world";		//Lambda Expression
		System.out.println(h.sayHello());
		
		Hello h1=()->{
			//System.out.println("abc");
			String msg="Hello again!";
			return msg;
		};
		System.out.println(h1.sayHello());
		h1.sayHola();
		Hello.sayBonjor();
	}
}