/* Create another class inheritance and object of class and call all the methods also mention the type of inheritance on the top of the program. 
 
 Name :- Shivam_Gupta
 Date :- 06/10/22
 */
package inhariteance;

public class OneDirection_Main extends Subof_OneDirection {
	
	//Main Class
	public static void main(String[] args)
	{
		OneDirection_Main d1 = new OneDirection_Main();  	// New Object creation
		d1.sing();
		System.out.println();
		d1.Speak();
		System.out.println();
		d1.Dance();
	}

}
