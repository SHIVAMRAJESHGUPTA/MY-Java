// WAP on NullPointerException & ArrayOutOfBound 

package Shivam;
import java.util.*;
public class NullPointer_And_ArrayOutOfBound {

	//Created Static Method
	static void Method(String s)
	 {
		s=null;
		// Taken Try & Catch Block
		 try {
				if(s.equals("Shivam"))
					System.out.println("Gupta");
		
			}
		 catch (NullPointerException n)
		 {
			 System.out.println("NullPointerException ::" +n);
		 }
		 // Finally Block 
		 finally {
			 System.out.println("The Program is Executed.");
		 }
		 System.out.println();
	 }
	
	// Main Method
	public static void main(String[] args) {
	
		// Calling Static Method
		Method(null);
		// Taken Try & Catch Block
		try {
			int[] a= {1,2,3,4,5,6,7,8,8,9};
			System.out.println(a[10]);
		}
		catch(Exception e)
		{
			System.out.println("Error ::"+e);
		}
		finally {
			 System.out.println("The Program is Executed.");
		 }

	}

}
