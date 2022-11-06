/*Write a Java program to check if a particular element exists in a linked list.
Date:3-11-22
Name:Shivam_Gupta
*/
package Shivam;

import java.util.*;

public class LinkedList_Exists {
	
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		LinkedList<String> obj = new LinkedList();
		int Name = sc.nextInt();
		switch (Name)//Switch Case
		{
		case 1:
			System.out.println("Ramesh");
			break;
		case 2:
			System.out.println("Ajay");
			break;
		case 3:
			System.out.println("Rajesh");
			break;
		case 4:
			System.out.println("Dinesh");
			break;
		case 5:
			System.out.println("Vjay");
			break;
			//When the user put default value
		default: 
		{
			System.out.println("Please Enter Number from 1 to 5");
		}
		
	}

	}}
