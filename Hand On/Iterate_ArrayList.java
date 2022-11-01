/*NAME : SHIVAM_GUPTA
 *  DATE : 01-11-22
 *  WAP TO ITERATE ARRAYLIST
 */

package Shivam;
import java.util.*;
public class Iterate_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<>();
		//Taking Add() method
		obj.add("Shivam");
		obj.add("Vishal");
		obj.add("Aditya");
		obj.add("Nive");
		obj.add("Swap");
		
		System.out.println("ArrayList is :"+obj);
		
		//Calling Iterator() Method
		
		Iterator<String> obj1 = obj.iterator();
		
		System.out.println("ArrayList Usig Iterator :");
		while(obj1.hasNext())
		{
			System.out.println(obj1.next());
		}
		
	}

}
