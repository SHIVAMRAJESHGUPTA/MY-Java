package Shivam;
import java.util.Scanner;
public class If_Loops {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int person= sc.nextInt();
		
		if(person >=18)
		{
			System.out.println("THIS PERSON CAN VOTE ");
		}
		else
		{
			System.out.println("Not eligible ");
		}
		
	}
}
