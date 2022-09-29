package Lab;

public class Project_Main {
	
	public static void main(String[] args) {
		Royal_Park r1 = new Royal_Park("Royal Park","500 sq.km");
		Nisarg_Green n1 = new Nisarg_Green("Nisarg Greens","450 sq.km");
		Project p1 = new Project(r1,n1,"Shivam",23);
		p1.display();
	}

}
