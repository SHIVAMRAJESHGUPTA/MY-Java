package Shivam;
import java.util.*;
import static java.lang.System.out;

public class Vector_Remove {
	public static void main(String... args)
	{
		Vector<String> input = new Vector();
		//using the add()
		input.add("JACK");
		input.add("JHON");
		
		//using Index Number
		input.add(2,"Alfas");  
		out.println("Vector: "+input);
		
		//using remove() method
		String s = input.remove(2);
		out.println("remove element: "+s);
		out.println("New Vectors: "+ input);
		
	}

}
