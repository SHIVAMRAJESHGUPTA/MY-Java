package Shivam;
import java.util.Scanner;
public class Bitwise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE 1NUMBER :");
		int num1=sc.nextInt();
		
		System.out.println("ENTER THE 2NUMBER :");
		int num2=sc.nextInt();
		sc.close();
		
		//Bitwise AND Operator
		System.out.println("num1&num2 : "+(num1 & num2));
		System.out.println("num1|num2 : "+(num1 | num2));//Bitwise OR Operator
		System.out.println("num1^num2 : "+(num1 ^ num2));//Bitwise XOR Operator
	}

}
