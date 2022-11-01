// WAP on one dimension array
package Shivam;
import java.util.*;
public class one_Dimension {
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);//using Scanner to take input from user
		System.out.println("Enter the Number ::");
		int a = sc.nextInt();
		int [] array = new int[5];
		System.out.println("enter the number you stored ");
		for(int i=0;i<a;i++)
		{
			array[i]=sc.nextInt();
		}
	}
	
}
