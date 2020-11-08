import java.util.Scanner;
import java.lang.Math;

abstract class Solid
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
	abstract public void print_details();
}
class Cylinder extends Solid
{
	private double surface_area_cylinder, volume_cylinder;
	Cylinder(int x,int y)
	{
		setshape(x,y);
	}
	public void print_details()
	{
		int r=geta();
		int h=getb();
		volume_cylinder=3.14*r*r*h;
		surface_area_cylinder=2*3.14*r*h;
		System.out.println("volume of cylinder is:"+volume_cylinder);
		System.out.println("surface area of cylinder is:"+surface_area_cylinder);
	}
}
class Cone extends Solid
{
	private double surface_area_cone, volume_cone;
	Cone(int x,int y)
	{
		setshape(x,y);
	}
	public void print_details()
	{
		int r=geta();
		int h=getb();
		double l=(r+Math.sqrt((r*r)+(h*h)));
		volume_cone=(3.14*r*r*h)/3;
		surface_area_cone=3.14*r*l;
		System.out.println("volume of cone is:"+volume_cone);
		System.out.println("surface area of cone is:"+surface_area_cone);
	}
}
class Sphere extends Solid
{
	private double surface_area_sphere, volume_sphere;
	Sphere(int y)
	{
		setshape(0,y);
	}
	public void print_details()
	{
		int r=getb();
		volume_sphere=(3.14*r*r*r*4)/3;
		surface_area_sphere=4*3.14*r*r;
		System.out.println("volume of spherer is:"+volume_sphere);
		System.out.println("surface area of sphere is:"+surface_area_sphere);
	}
}
public class prog1
{
	public static void main(String[]args){
		Scanner xx=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the radius of the cylinder : ");
		a=xx.nextInt();
		System.out.println("Enter the height of the cylinder : ");
		b=xx.nextInt();
		Cylinder cyl= new Cylinder(a,b);
		cyl.print_details();
		System.out.println("Enter the radius of the cone : ");
		a=xx.nextInt();
		System.out.println("Enter the height of the cone : ");
		b=xx.nextInt();
		Cone con= new Cone(a,b);
		con.print_details();
		System.out.println("Enter the radius of the sphere : ");
		b=xx.nextInt();
		Sphere s= new Sphere(b);
		s.print_details();
	}
}
