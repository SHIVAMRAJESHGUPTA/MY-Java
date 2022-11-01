package Shivam;
import java.util.*;
public class Natural_Numbers {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);        // Take number from user

		System.out.println("ENTER NUMBER :  ");
		int num = sc.nextInt();
		System.out.println("This is a Natural Number : ");
		int i = 1;
		while(i<=num)// While loop
		{
			System.out.println(i+"");
			i++;
		}
	}
}
