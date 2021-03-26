
public class Person {
	private String name;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
		//name="Anunymous";
		//age=-1;
		this("Annonymous",-1);
	}
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println("Name: "+name+"\tAge: "+age);
	}
	
	@Override
	public String toString() {
		
		return "Name: "+name+"\tAge: "+age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p=(Person) obj;
			if(p.name.equals(this.name)&& p.age==this.age)
				return true;
		}
		return false;
	}
	

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Person is no more");
	}

	public static void main(String[] args) {
		
		Person p;
		for (int i=0;i<5;i++) {
			p=new Person();
		}
		System.gc();  	//Requesting gc
		//Person p1=new Person("Polo", 21);
//		p1.print();
//		System.out.println(p1.hashCode());
//		System.out.println(p1.toString());  	//Class@hex of hashCode
		//Person p2=new Person("Polo",2);
		//System.out.println(p1.equals(p2));
	}
}
