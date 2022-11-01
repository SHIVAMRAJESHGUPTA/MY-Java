package Shivam;
import java.util.*;
import static java.lang.System.out;

public class Priority_Queue {
	public static void main(String...args) {
		
		//using linkedList class to create queue.
				Queue<Integer> input = new PriorityQueue<>();
				//offer elements to the queue
				input.offer(15);
				input.offer(55);
				input.offer(85);
				input.offer(2);
				out.println("Queue is: "+input);
				
				//access element of the queue using peek() method
				int i = input.peek();
				out.println("access element: " + i);
				
				//remove element from the queue using poll() method
				int j = input.poll();
				out.println("removed element: " + j);
				
				out.println("the updated is queue: "+input);
		
		
	}

}
