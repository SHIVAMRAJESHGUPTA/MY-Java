package Shivam;
import java.util.*;
import static java.lang.System.out;

public class Queue_List {

	public static void main(String... args) {
	
		//using linkedlist class to create queue
		Queue<Integer> input = new LinkedList();
		
		//offer elements to the queue
		input.offer(8);
		input.offer(10);
		input.offer(15);
		out.println("Queue is :"+input);
		
		//access element of the queue using peek() method
		int i = input.peek();
		System.out.println("access element :"+i);
		
		//remove element of the queue using poll() method
		int j = input.poll();
		out.println("remove element :"+j);
		
		out.println("The Update is Queue :"+input);
	}

}
