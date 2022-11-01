package Shivam;
import java.util.Scanner;
public class Main_Circle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius : ");
	
		int a = sc.nextInt();
		double pi = 3.14;
		
		Circle c = new Circle();
		c.getArea(a, pi);
		
		
	}

}
