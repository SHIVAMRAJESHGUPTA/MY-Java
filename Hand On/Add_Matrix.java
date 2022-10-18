/* WAP to Add 2 Matrix
 * Name:Shivam_Gupta
 * Date:17-10-22
 */

package Shivam;
import java.util.*;
import static java.lang.System.out;
public class Add_Matrix {
	public static void main(String ... args)
	{
		int i,j,a,b;
		Scanner sc = new Scanner(System.in);
		out.println("Enter the No.of rows :");
		// Taking row as input
		a=sc.nextInt();
		out.println("enter the no.of col :");
		// Taking columns as input
		b=sc.nextInt();
		//Declaring the 2-D matrix
		int array[][]=new int [a][b];
		//Read the matrix value
		out.println("Enter the elements of array");
		//Loop for Row
		for (i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
		{
		array[i][j]=sc.nextInt();
		//Accessing arrays values
		}
		}
		out.println("1st Elements of array : ");
		for(i=0;i<a;i++)
			//Print arrays values
		{	
		for (j=0;j<b;j++)
		{
			out.print(array[i][j]+" ");
		}
		out.println();
	}
		//System.out.println();
		
		int array1[][]=new int [a][b];
		//Read the matrix value
		out.println("Enter the 2 elements of array");
		//Loop for Row
		for (i=0;i<a;i++)
		{
			for(j=0;j<b;j++) //Loop for columns
		{
		array1[i][j]=sc.nextInt();
		//Accessing arrays values
		}
		}
		out.println("2nd Elements of array : ");
		for(i=0;i<a;i++)
			//Print arrays values
		{	
		for (j=0;j<b;j++)
		{
			out.print(array1[i][j]+" ");
		}
		out.println();	
		}
		
		int array2[][]=new int[a][b];
		// Doing Sum of 1 matrix and 2 matrix
		out.println("add of two arrays");
		for (i=0;i<a;i++) {
			for (j=0;j<b;j++)
			{
				array2[i][j]=array[i][j]+array1[i][j];
				 System.out.print(array2[i][j]+" ");
				 System.out.print(array2[i][j]+" ");
			}
				out.println(); 
				 
				// Doing Sub of 1 matrix and 2 matrix
				 out.println("sub of two arrays");
				 for (i=0;i<a;i++) {
						for (j=0;j<b;j++)
						{

				array2[i][j]=array[i][j]-array1[i][j];
				out.print(array2[i][j]+" ");
				out.print(array2[i][j]+" ");
						}
						out.println();
				
				// Doing div of 1 matrix and 2 matrix
				out.println("div of two arrays");
				for (i=0;i<a;i++) {
					for (j=0;j<b;j++)
					{

				array2[i][j]=array[i][j]/array1[i][j];
				out.print(array2[i][j]+" ");
				out.print(array2[i][j]+" ");
					}
					out.println();
				
				
				// Doing mul of 1 matrix and 2 matrix
				out.println("mul of two arrays");
				for (i=0;i<a;i++) {
					for (j=0;j<b;j++)
					{

				array2[i][j]=array[i][j]*array1[i][j];
				out.print(array2[i][j]+" ");
				//out.print(array2[i][j]+" ");
				
			}
			out.println();
		}
				}}}}}


