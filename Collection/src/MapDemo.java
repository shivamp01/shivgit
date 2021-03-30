import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String , String> map=new LinkedHashMap<String, String>();
		map.put("jack", "jill");
		map.put("polo", "lili");
		map.put("jack", "rose");
		System.out.println(map.get("polo"));
		System.out.println(map.get("jack"));
		
		Set<String> keys=map.keySet();
		for(String key:keys) {
			System.out.println("Key :"+key);
			System.out.println("Value:"+map.get(key));
			System.out.println();
		}
		
	}
}
