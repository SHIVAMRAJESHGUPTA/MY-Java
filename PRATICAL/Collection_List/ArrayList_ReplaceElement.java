/*Write a Java program to replace the second element
of a ArrayList with the specified element.
Name:Shivam_Gupta
Date:03-11-22
*/
package Shivam;

import java.util.ArrayList;

   public class ArrayList_ReplaceElement {
	
	//Main MAthod
	public static void main(String []args)
	{
		
		ArrayList<String> obj = new ArrayList();
		//Using Add() Method 
		obj.add("Rajesh");
		obj.add("Ajay");
		obj.add("Dinesh");
		obj.add("Ayappan");
		System.out.println("ArrayList is "+obj);
		//Take set() Method to repalce
		obj.set(0,"Ramesh");
		
		System.out.println("Replace Array List"+obj);
	}

}
