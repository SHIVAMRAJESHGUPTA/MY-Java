/*name :- Shivam_Gupta
 * Date:- 12-10-22
 * Program to demonstrate (do-while)and print the reverse counting from the user 
 */

package Shivam;
import java.util.*;
public class HandsOn_DoWhile {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		do
		{
			System.out.println(num);
			num--;

		}
		while(num>=0);
	}

}
