import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {
	public static void main(String[] args) {
		
		PersonAgeComparator pac=new PersonAgeComparator(); 
		Comparator<Person> pnc=(p1,p2)->p1.getName().compareTo(p2.getName());
		
		TreeSet<Person> persons=new TreeSet<Person>(pac);
		persons.add(new Person("polo",21));
		persons.add(new Person("lili",19));
		persons.add(new Person("mili",17));
		
		for(Person p:persons)
			System.out.println(p);	
		
	}
}
