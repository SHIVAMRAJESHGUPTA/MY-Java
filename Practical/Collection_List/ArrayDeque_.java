package Shivam;
import java.util.*;
import static java.lang.System.out;
public class ArrayDeque_ {
	public static void main(String...args) {

		ArrayDeque<String> input= new ArrayDeque();
		input.add("Masud");
		input.add("Vikram");
		
		//using addfirst() method
		input.addFirst("Vishal");
		
		//using addLast() method
		input.addLast("Bhakti");
		
		out.println("Array Deque :"+input);
		
	}
}


