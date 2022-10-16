package Shivam;
import java.util.*;
public class Aaray {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int num = sc.nextInt();
		
		int a[] = new int[num];
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Enter"+i+"Number of the Array : ");
			int num2 = sc.nextInt();
			a[i]=num2;
		}
		
		System.out.println("Aaray is [");
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+",");
			if(j==4)
			{
				System.out.println(a[j]+" ");
			}
		}
		System.out.println("]");
	}
		
}
