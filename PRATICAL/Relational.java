package Shivam;
import java.util.Scanner;
public class Relational {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1value : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2value : ");
		int num2 = sc.nextInt();
		sc.close();
		//Performing equal Operation
		System.out.println("num1==num2"+(num1==num2));
		System.out.println("num1!=num2"+(num1!=num2));//Performing not equal to Operation
		System.out.println("num1>num2"+(num1>num2));//Performing greater  Operation
		System.out.println("num1<num2"+(num1<num2));//Performing less Operation
		System.out.println("num1>=num2"+(num1>=num2));//Performing greater equal Operation
		System.out.println("num1<=num2"+(num1<=num2));//Performing less equal  Operation
	}

}
