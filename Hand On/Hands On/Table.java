/* Print any Multiplication table for loop take the input from the user in all the program 
Name :- Shivam
Date :- 11-10-22
*/
package Shivam;
import java.util.*;
public class Table {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*num);
		}
		
		
	}
}
