package Shivam;
import java.util.*;
import static java.lang.System.out;

public class Vector_List {

	public static void main(String[] args) {
		Vector<String> input = new Vector();
		input.add("Shivam");
		input.add("Vishal");
		//Using index number
		input.add(2,"Aditya");
		input.add(3,"Ajay Gaud");
		input.add(4,"Dinesh Kumar");
		out.println("Vectors :"+input);
		
		//using addAll Method
		Vector<String> input1 =new Vector();
		input1.add("Bada");
		input1.add("Shubham");
		input.addAll(input);
		out.println(" New Vector :"+input1);
	}

}
