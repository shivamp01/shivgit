import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Stream4Demo {
	
	public static void process(Integer i) {
		//System.out.println(i);
	}
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<Integer>();
		for(int i=1;i<=1000;i++) {
			numbers.add(i);
		}
		
		//List<Integer> list=IntStream.range(1,1000).collect(supplier, accumulator, combiner);
		long startTime=System.currentTimeMillis();
		numbers.stream().forEach(Stream4Demo::process);
		long endTime=System.currentTimeMillis();
		System.out.println("time"+(endTime-startTime));
		
		startTime=System.currentTimeMillis();
		numbers.parallelStream().forEach(Stream4Demo::process);
		endTime=System.currentTimeMillis();
		System.out.println("time"+(endTime-startTime));
		
		
	}
}
