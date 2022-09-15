class MainEmploye
{
public static void main(String[] args)
{
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();

e1.id=1;
e1.name="Shivam";

e2.id=2;
e2.name="Aditya";

e3.id=3;
e3.name="Vishal";

e1.displaydata();
e2.displaydata();
e3.displaydata();
}
}