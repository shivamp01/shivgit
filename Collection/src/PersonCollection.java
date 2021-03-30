import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class PersonCollection {
	public static void main(String[] args) {
		
		Vector<Person>  persons=new Vector<Person>();
		persons.add(new Person("polo",21));
		persons.add(new Person("lili",19));

		persons.add(new Person("mili",17));

//		for(Person p:persons)
//			System.out.println(p.toString());
//		
		Map<Integer,Person> map=new HashMap<Integer	, Person>();
		int idx=0;
		for(int i=0;i<persons.size();i++) {
			map.put(i+1, persons.get(i));
		}
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		
	}
}
