//Demonstate if-else statement of 5 Subject The Person who gets above 60% will be pass other wise fail
//Name :- Shivam_Gupta
//Date :- 11-10-22
package Shivam;
import java.util.Scanner;
public class Percentage {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	// Taken input from User Taking 5 Subject Marks from user   
		System.out.println("Enter your Name");
		String Name = sc.nextLine();
		System.out.println("Enter English Mark");
		int English = sc.nextInt();
		System.out.println("Enter Maths Mark");
		int Maths = sc.nextInt();
		System.out.println("Enter Science Mark");
		int Science = sc.nextInt();
		System.out.println("Enter Geog Mark");
		int Geog = sc.nextInt();
		System.out.println("Enter History Mark");
		int History = sc.nextInt();
		
		int Percentage = (English+Maths+Science+Geog+History)/5;// Taking percent  
		System.out.println("percentage : "+Percentage);
		if( Percentage>=60)
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("fail");

		}
		
	}
}
