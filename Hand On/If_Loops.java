//Test Whether the person is eligible or not for vote
//Name :- Shivam_Gupta
//Date :- 11-10-22
package Shivam;
import java.util.Scanner;
public class If_Loops {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); //taking input from user 
		System.out.println("Enter the age : ");
		int person= sc.nextInt();
		
		if(person >=18)		//if it is eligible //if else loop 
		{
			System.out.println("THIS PERSON CAN VOTE ");
		}
		else		// if it is not eligible 
		{
			System.out.println("Not eligible ");
		}
		
	}
}
