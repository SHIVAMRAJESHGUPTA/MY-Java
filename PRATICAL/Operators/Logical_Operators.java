package Shivam;
import java.util.Scanner;
public class Logical_Operators {
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1value : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2value : ");
		int num2 = sc.nextInt();
		System.out.println("Enter the 3value : ");
		int num3 = sc.nextInt();
		
		System.out.println("Perfirming AND Operators : ");
		//Using Logical AND to verify 2 constraint.
		
		if((num1<num2)&&(num1==num3))
		{
			int sum = num1+num2+num3;
			System.out.println("Sum is "+sum);
		}
		else
		{
			System.out.println("False Condition : ");
		}
		System.out.println("Performing OR Operaytion");
		// Using Logical OR to Verify Two Constraint.
		if((num1<num2)||(num1==num3))
		{
			int sum = num1+num2+num3;
			System.out.println("Sum is "+sum);
		}
		else
		{
			System.out.println("False Condition : ");
		}
		System.out.println("Performing NOT Operation");
		
		System.out.println("!(num1<num2)"+!(num1<num2));
		

	}

}
