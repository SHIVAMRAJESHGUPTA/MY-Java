/* WAP for Reverse String Array 
 * NAME:- Shivam_Gupta
 * DATE:-21-10-22
 */

package Shivam;
import java.util.*;
public class Reverse {
 public static void main (String... args)
 {
	{
		Scanner sc = new Scanner(System.in);// Taking input from user
		System.out.print("Type a Sentence : ");
		String a = sc.nextLine();
		char[] b= a.toCharArray();
		System.out.print("Reverse String is [");
		for(int i=b.length-1;i>=0;i--)// for loop for showing reverse output 
		{
			System.out.print(b[i]+",");
		}
		System.out.println("]");
	}
}
}
