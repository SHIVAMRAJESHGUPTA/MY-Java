/*Write a Java program to compare two sets and retain elements 
which are same on both sets.(use retainAll method)
Date:3-11-22
Name:Shivam_Gupta
*/
package Shivam;
import java.util.*;
  class Retain_Method {

	public static void main(String...args)
	{	
			ArrayList<String> obj = new ArrayList();
			//Using Add() Method 
			obj.add("Rajesh");
			obj.add("Ajay");
			obj.add("Dinesh");
			obj.add("Ayappan");
			
			System.out.println("ArrayList of fist obj "+obj);
			
			ArrayList<String> obj1 = new ArrayList();
			//Using Add() Method 
			obj1.add("Harshal");
			obj1.add("Vishal");
			obj1.add("Dinesh");
			obj1.add("Manikandan");
			
			System.out.println("ArrayList of second obj2 "+obj1);
			
			//Applying retainall() method
			obj.retainAll(obj1);
			System.out.println("after retain :");
			
			System.out.println("retain element "+obj);
	}
}
