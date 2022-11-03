package Shivam;

import static java.lang.System.out;

import java.util.*;

  public class Priority_Queue {

	public static void main(String...args) {
			
		Queue<Integer> obj = new PriorityQueue<>(Collections.reverseOrder());
		//Using Add() Method 
		obj.add(17);
		obj.add(11);
		obj.add(51);
		obj.add(30);
		obj.add(89);
		obj.add(77);
		obj.add(76);
		obj.add(100);
		obj.add(55);
		
		out.println("ArrayList of obj is "+obj);
		
		Integer val = null;
		// While Loop
		while((val = obj.poll()) != null)
		{
			System.out.print(val+" ");
		}
		out.println(" ");
	}

}
