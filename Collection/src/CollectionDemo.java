import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;



public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("google");
		list.add("oracle");
		list.add(2, "microsoft");
		list.add("IBM");
		list.add("TCS");
		System.out.println("Traversing list----using for loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		
		}
		System.out.println("Traversing list through iterators");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Traversing list through for each");
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("linklist**********");
		LinkedList<String> link=new LinkedList<>();
		link.add("apple");
		link.addFirst("oracle");
		link.addLast("eclipse");
		list.addAll(link);		//merge linklist to arraylist
		
		list.remove(1);
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println("printing set************");
		HashSet<String> set=new HashSet<String>(list);
		for(String s:set) {
			System.out.println(s);
		}
		System.out.println("treeset****************");
		TreeSet<String> tset=new TreeSet<String>(set);
		for(String s:tset) {
			System.out.println(s);
		}
		
		HashSet<String> set1=new HashSet<String>();
		set1.add("d");
		set1.add("b");
		set1.add("f");
		set1.add("e");
		set1.add("a");
		
		
		for(String i:set1)
			System.out.println("***"+i);
		
	}
}
