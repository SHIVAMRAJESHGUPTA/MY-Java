package Shivam;

interface Interface {
	
	void getArea(int Radius, double pi );
	
	

}

class Circle implements Interface
{
	public void getArea(int Radius,double pi)
	{
		System.out.println("The area of Circle : "+Radius*Radius*pi);
	}
}