import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NewStreamDemo {
	public static void main(String[] args) {
		
		
		Integer[] arr=new Integer[] {1,7,8,10,9,15,17,3,2};
		List<Integer> list=Arrays.asList(arr);
		
		//list.stream().distinct().forEach(System.out::println);
//		list.stream().sorted().forEach(System.out::println);
//		System.out.println("sum is"+list.stream().reduce(0,Integer::sum));
//		list.stream().limit(5).forEach(System.out::println);
//		
		
		String[] star= {"cherry","mango","grapes","apple","banana","ball"};
		List<String> input=Arrays.asList(star);
		
		input.stream().sorted().forEach(System.out::println);
		
		input.stream().map(str->str.toUpperCase()).forEach(System.out::println);
		
		input.stream().findFirst().ifPresent(System.out::println);
		
		input.stream().filter(str->str.startsWith("b")).forEach(System.out::println);
		
		input.stream().filter(str->str.contains("ple")).forEach(System.out::println);
		
		Stream.of("a","b","c","e","d").sorted().forEach(System.out::println);
		
		System.out.println(Arrays.stream(star).filter(str->str.contains("p")).count());
		
		System.out.println(IntStream.range(1, 99).count());
		System.out.println("------------");
		IntStream.range(1, 10).skip(4).forEach(System.out::println);
		IntStream.range(1,10).sum();
		
	}
}
