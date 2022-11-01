package lab;

public class Phone_Main {

	public static void main(String[] args) {
		Phone p1 = new Phone(6.0, 4, "Pink");
		Phone p2 = new Phone(8, 6, "Blue");
		Phone p3 = new Phone(5.5, 12, "Pista");
		
		Phone[] arr = new Phone[3];
		
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;

	
	for(Phone p : arr)
	{
		System.out.println("Display: " + p.Display + " ram : "+ p.Ram + "     and color: "+ p.Color);
	}

}}
