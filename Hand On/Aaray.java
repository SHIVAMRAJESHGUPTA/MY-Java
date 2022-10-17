package Shivam;
import java.util.*;
public class Aaray {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int num = sc.nextInt();
		// creating single dimentional array a[] and passing the num value and passing the length of array
		int a[] = new int[num];		
		// using for loop to add arrays element 
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Enter"+i+"Number of the Array : ");
			int num2 = sc.nextInt();
			a[i]=num2;
		}
		// printing the single dimentional array
		System.out.println("Aaray is [");
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+",");
			//if(j==4) 
			//{
			//	System.out.println(a[j]+" ");
			//}
		}
		System.out.println("]");
	}
		
}
