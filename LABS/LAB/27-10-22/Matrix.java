package Shivam;
import java.util.*;
import static java.lang.System.out;

public class Matrix {

	public static void main(String...args) {
			int i,j,a,b;
			//User Input
			Scanner sc = new Scanner(System.in);
			out.println("Enter the No.of rows :");
			// Taking row as input
			a=sc.nextInt();
			out.println("Enter the no.of col :");
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
			out.println("Elements of array : ");
			for(i=0;i<a;i++)
				//Print arrays values
			{	
			for (j=0;j<b;j++)
			{
				out.print(array[i][j]+" ");
			}
			out.println();
		}
			
			int array1[][]=new int [a][b];
				}

}
