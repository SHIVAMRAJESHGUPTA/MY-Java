/*  WAP to print Accending and Dessending
 * Date :- 20-10-22
 */

package Shivam;
import java.util.*;
//import java.util.Array;
public class AccendingDecending_Order {
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

	Arrays.sort(array);
	System.out.println("Accending array is" +Arrays.toString(array));
}
}
