import java.util.Scanner;

class Circle{
	private double radius;
	private double area;
	private double perimeter;
	
	void getdata(){
		Scanner xx=new Scanner(System.in);
		System.out.print("Enter the radius of the circle : ");
		radius=xx.nextDouble();
	}
	void calculatearea()
	{
		area=3.14*radius*radius;
	}
	void calculateperimeter()
	{
		perimeter=2*3.14*radius;
	}
	void printdata()
	{
		System.out.println("The radius of the circle is : "+radius);
		System.out.println("The area of the circle is : "+area);
		System.out.println("The perimeter of the ciecle is : "+perimeter);
	}
}

public class prog2{
	public static void main(String args[]){
		Circle c=new Circle();
		c.getdata();
		c.calculatearea();
		c.calculateperimeter();
		c.printdata();
	}
}
