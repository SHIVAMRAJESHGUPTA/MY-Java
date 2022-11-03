/*
 
 */

package Shivam;
import java.util.*;
import static java.lang.System.out;
  public class Tree_Set {
	public static void main(String...args)
	{
		TreeSet<Integer> obj = new TreeSet();
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
		
		out.println("ArrayList of fist obj "+obj);
		int x = 12;
		System.out.println(obj.ceiling(x));
		
				
	}
}