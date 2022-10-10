package Shivam;

import java.util.Scanner;

public class Unary {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int num1 = sc.nextInt();
		sc.close();
		
		// Pre-Increment Operator  
		++num1;
		System.out.println("pre increment value :" + num1);
		num1++;
		System.out.println("post increment value :" + num1); // Post-Increment Operator  
		--num1;
		System.out.println("pre increment value :" + num1); // Pre-Increment Operator  
		num1--;
		System.out.println("post increment value :" + num1);// Post-Increment Operator  
		
	}

}



