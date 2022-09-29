package Lab;

public class Project {
	
	String builder_name;
	int age;
	Royal_Park royal_park;
	Nisarg_Green nisarg_green;
	
	
	public Project(Royal_Park royal_park,Nisarg_Green nisarg_green,String builder_name,int age) {
		super();
		this.age=age;
		this.builder_name=builder_name;
		this.nisarg_green=nisarg_green;
		this.royal_park=royal_park;
	}
	
	void display()
	{
		System.out.println(builder_name);
		System.out.println(age);
		System.out.println(nisarg_green);
		System.out.println(royal_park);
	}
}
