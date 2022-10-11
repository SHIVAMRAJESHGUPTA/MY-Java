/*program to demonstrate (switch)and printing week days
 Name :- Shivam_Gupta
 Date :- 11-10-22  
 */

package Shivam;
import java.util.*;
public class Switch_Case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Taking user Input
		System.out.println("Enter the days in numbers : ");
		int weeks = sc.nextInt();
		
		switch (weeks)//Switch Case
		{
		case 1:
			System.out.println("This day is Monday");
			break;
		case 2:
			System.out.println("This day is Tuesday");
			break;
		case 3:
			System.out.println("This day is Wednesday");
			break;
		case 4:
			System.out.println("This day is Thusday");
			break;
		case 5:
			System.out.println("This day is Friday");
			break;
		case 6:
			System.out.println("This day is Saturday");
			break;
		case 7:
			System.out.println("This day is Sunday");
			break;
			default://When the user put default value
			{
				System.out.println("Please Enter Proper Number");
			}
		}
	}

}
