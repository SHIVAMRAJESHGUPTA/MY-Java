package Shivam;

import java.util.*;
import static java.lang.System.out;

public class Stack_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> input = new Stack();
		input.push("Ajay");
		input.push("Dinesh");
		
		out.println("Stack Value :"+input);
		//pop elements from the top
		
		input.pop();
		out.println("Stack After Pop :"+input);

	}

}
