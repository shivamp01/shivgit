import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Deque<String> dq=new ArrayDeque<>();
		dq.offer("apple");
		dq.offerFirst("mango");
		dq.offerLast("google");
		System.out.println(dq.peekFirst());
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		dq.offer("banana");
		dq.offer("ibm");
		dq.offer("google");
		
		for(String str:dq)
			System.out.println(str);
	
		Queue<Integer> que=new LinkedList<>();
		que.add(1);
		que.offer(2);
		
		while(!que.isEmpty())
			System.out.println(que.poll());
	
	}
	
	
}
