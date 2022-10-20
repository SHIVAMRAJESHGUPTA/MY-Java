package Shivam;
import java.util.*;
public class Decending_Order {
	
		public static void main(String[] args)
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of element in array :: ");
		int a = sc.nextInt();
		Integer array[] = new Integer[a];
				
		System.out.println("Enter elements ");
		
		for(int i=0;i<a;i++)	
		{
			array[i] = sc.nextInt();
		}
		//Print original array
		System.out.println("Original element array " +Arrays.toString(array));
		
		
		//sort the array in descending order
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println("Decending array is " +Arrays.toString(array));

}}
