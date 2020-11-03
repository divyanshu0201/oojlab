import java.util.Scanner;
abstract class shape
{
	private int a,b;
	void setshape(int x,int y)
	{
		a=x;
		b=y;
	}
	int geta()
	{
		return a;
	}
	int getb()
	{
		return b;
	}	
	abstract public void print_area();
}
class rectangle extends shape
{
	private int area_rect;
	rectangle(int x,int y)
	{
		setshape(x,y);
	}
	public void print_area()
	{
		area_rect=geta()*getb();
		System.out.println("Area of rectangle is:"+area_rect);
	}
}
class triangle extends shape
{
	private double area_tri;
	triangle(int x,int y)
	{
		setshape(x,y);
	}
	public void print_area()
	{
		area_tri=(geta()*getb())/2;
		System.out.println("The area of triangle is:"+area_tri);
	}
}
class circle extends shape
{
	private double area_circle;
	circle(int y)
	{
		setshape(0,y);
	}
	public void print_area()
	{
		area_circle=((3.14)*getb()*getb());
		System.out.println("Area of circle is:"+area_circle);
	}
}
public class week81
{
	public static void main(String[]args){
		Scanner xx=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the length of rectangle : ");
		a=xx.nextInt();
		System.out.println("Enter the breadth of rectangle : ");
		b=xx.nextInt();
		rectangle r= new rectangle(a,b);
		r.print_area();
		System.out.println("Enter the height of triangle : ");
		a=xx.nextInt();
		System.out.println("Enter the base of triangle : ");
		b=xx.nextInt();
		triangle t= new triangle(a,b);
		t.print_area();
		System.out.println("Enter the radius of circle : ");
		a=xx.nextInt();
		circle c= new circle(a);
		c.print_area();
	}
}
