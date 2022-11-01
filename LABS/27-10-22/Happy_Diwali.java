package Shivam;
import static java.lang.System.out;
public class Happy_Diwali {

	public static void main(String...args) {
		
		
		String wish = "HAPPY DIWALI";
		//make array using length 
		char[] var = new char[wish.length()];
		//Using for Loop
		for (int i=0; i<wish.length(); i++)	{
			var[i]=wish.charAt(i);
		}
		for(char var1 : var) {
			out.print(var1);
		}
	}
	}


