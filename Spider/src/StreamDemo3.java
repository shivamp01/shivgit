import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo3 {
	public static void main(String[] args) {
		
		Map<String, String> map=new HashMap<String, String>();
		map.put("polo", "pune");
		map.put("mili", "mumbai");
		map.put("shivam", "bangalore");
		
		map.values().stream().forEach(System.out::println);
		List<String> cities=map.values().stream().map(c->c.toUpperCase()).collect(Collectors.toList());
		cities.forEach(System.out::println);
		
		Map<String,List<String>> contacts=new HashMap<String, List<String>>();
		contacts.put("frudo", Arrays.asList("123","456"));
		contacts.put("sean",Arrays.asList("167","0987"));
		contacts.put("bean",Arrays.asList("16667","670987"));
		contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);
		
		
	}
}
