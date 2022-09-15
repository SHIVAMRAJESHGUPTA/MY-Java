class Companys
{
	String name;
	String company_name;
	String department;
	Companys(String a,String b,String c)
{
	name = a;
	company_name = b;
	department = c;
}
        void display(){
	System.out.println(name+" "+company_name+" "+department);
}
	public static void main(String[] args)
{
	Companys c1 = new Companys("Shivam","TCS","IT Department");
	System.out.println();

	Companys c2 = new Companys("Vishal","Bank of America","IT Department");
	System.out.println();

	Companys c3 = new Companys("Aditya","infosys","IT Department");
	System.out.println();
	c1.display();
	c2.display();
	c3.display();
}
}