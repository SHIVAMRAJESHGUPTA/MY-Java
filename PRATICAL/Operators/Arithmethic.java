package Shivam;
import java.util.Scanner;

public class Arithmethic {
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in); 	// Taking User Input
		System.out.println("Enter The 1st Value : ");
		int a = sc.nextInt();
		System.out.println("Enter The 2nd Value : ");
		int b = sc.nextInt();
		sc.close();
		
		int Add , Mul,Sub,Mod;		// Arithmethic perators
		double Div;
		Add = a+b;
		Mul = a*b;
		Div = a/b;
		Sub = a-b;
		Mod = a%b;
		
		System.out.println("Additon is : "+Add);
		System.out.println("Substraction is : "+Sub);
		System.out.println("Multiplication is :"+Mul);
		System.out.println("Division is :"+Div);
		System.out.println("Module is :"+Mod);
		
	}

}
