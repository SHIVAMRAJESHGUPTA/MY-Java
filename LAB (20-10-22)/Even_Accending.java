/* WAP for Even Accending order 
 * date :- 20-10-22
 */

package Shivam;
//import java.util.Arrays;
import java.util.*;
public class Even_Accending {

	// MAIN METHOD
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the number of elements in array: ");
			int size=sc.nextInt();

			Integer a[] = new Integer[size];
			System.out.println("Enter the elements of an array");
			
			for(int i=0;i<size;i++)
			{
				int b=sc.nextInt();
				a[i]= b;
			}
			//to arrange arrays in ascending order we used sort method.
			Arrays.sort(a);
			System.out.println("\nResult");
			
			for(int j=0;j<size;j++)
			{
				if(a[j]%2==0)
				{
				System.out.print(a[j]+" ");
			}
			
		}

	}
}

