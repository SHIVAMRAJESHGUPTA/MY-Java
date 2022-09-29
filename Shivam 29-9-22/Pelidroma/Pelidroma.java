package Lab_test;

public class Pelidroma {
	
	public static void main(String[] args) {
		String L1="";	
		char ch ;
		String L2 = null;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("write a name :");		
		String Name = sc.nextLine();		
		char [] x = Name.toCharArray();
			for(int i=x.length-1;i>=0;i--) 
			{
				ch = x[i];
				L2= Character.toString(ch);
				L1 = L1+L2;
			}
			System.out.println(L1);
			if(Name.equalsIgnoreCase(L1)) {
				System.out.print("this is  pelindrome"); 
			}
			else {
				System.out.print("this not pelindrome");
			}
	}

}
