/*name :- Shivam_Gupta
 * Date:- 12-10-22
 * Program to demonstrate while loop continues until entered number is positive 
 */

package Shivam;
import java.util.*;
public class Handon_Whileloop {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number :");
		while(true)
		{
			System.out.println("Enter the number :");
			int num = sc.nextInt();
		if(num<0)
		{
			System.out.println("By  by");
			break;
		}
			
			
		}
	}

}
