package Shivam;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st value : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd value : ");
		int num2 = sc.nextInt();
		sc.close();
		
		num1+=num2;		//
		System.out.println("num1="+num1);
		num1-=num2;
		System.out.println("num1="+num1);
		num1*=num2;
		System.out.println("num1="+num1);
		num1/=num2;
		System.out.println("num1="+num1);
		num1%=num2;
		System.out.println("num1="+num1);

	}
}