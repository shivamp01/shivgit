import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	
	public static void print(Object o) {
			System.out.println(o);
	}
	public static void main(String[] args) {
		
		Integer[] arr= {2,5,7,9,2};
		List<Integer> numbers=Arrays.asList(arr);
		//numbers.forEach(System.out::println);
		//numbers.forEach(StreamDemo::print);
		
		//numbers.stream().distinct().forEach(System.out::println);
		
		Stream<Integer> str1=numbers.stream().distinct();
		//System.out.println(str1.count());
		//str1.forEach(System.out::println);
		
		Stream<Integer> str2=numbers.stream().filter(n->n>=5);
		str2.forEach(System.out::println);
		
		numbers.stream().limit(3).forEach(System.out::println);
		
		numbers.stream().sorted().forEach(System.out::println);
		
		System.out.println("Sum up values");
		//System.out.println(numbers.stream().collect(Collectors.summingInt(Integer::intValue)));
		//System.out.println(numbers.stream().filter(n->n==n).mapToInt(i->i).sum());
		System.out.println(numbers.stream().reduce(0, (a,b)->a+b));
		System.out.println(numbers.stream().reduce(0,Integer::sum));
	}

}
