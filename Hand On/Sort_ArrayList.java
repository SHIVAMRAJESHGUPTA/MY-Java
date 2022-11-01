/*NAME : SHIVAM_GUPTA
 * DATE : 01-11-22
 * WAP TO SORT ARRAYLIST IN DECERSING ORDER
 */

package Shivam;
import java.util.*;

public class Sort_ArrayList {

	public static void main(String[] args) {

		ArrayList<String> obj = new ArrayList<>();
		//Taking Add() method
		obj.add("Shivam");
		obj.add("Vishal");
		obj.add("Aditya");
		obj.add("Nive");
		obj.add("Swap");
		
		System.out.println("ArrayList is :"+obj);
	// Sort the ArrayList in Decresing Order
		Collections.sort(obj,Collections.reverseOrder());
		System.out.println("Decresing order is :"+obj);
	}

	}


