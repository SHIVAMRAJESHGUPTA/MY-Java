/* wap on Narrowing 
 * Name : Shivam_gupta
 * Date : 14-10-22
 */

package Shivam;
import java.util.*;
public class Narrowing {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number : ");
		double d = sc.nextDouble();
		
		long l=(long)d;
		int i = (int)l;
		
		System.out.println("double value is "+d);
		System.out.println("long value is "+l);
		System.out.println("int value is "+i);
		
	}

}
