import java.util.Scanner;

class Employee{
	private int empid;
	private  String empname;
	private double empnohrs;
	private double empbasic;
	private double emphra , empda , empit , empgross;
	
	void getdata()
	{
		Scanner xx=new Scanner(System.in);
		System.out.print("Enter the employee id : ");
		empid=xx.nextInt();
		System.out.println("Enter the name : ");
		empname=xx.nextLine();
		xx.nextLine();
		System.out.println("Enter the number of hours employee worked : ");
		empnohrs=xx.nextDouble();
		System.out.println("Enter the basic salary of employee : ");
		empbasic=xx.nextDouble();
		System.out.println("Enter the hra% of the employee : ");
		emphra=xx.nextDouble();
		System.out.println("Enter the da% of the employee : ");
		empda=xx.nextDouble();
		System.out.println("Enter the it% of the employee : ");
		empit=xx.nextDouble();
	}
	void calculate()
	{
		empgross= (empbasic + empbasic*((emphra/100)+(empda/100)-(empit/100)));
		if(empnohrs>200)
		{
			empgross=empgross + (empnohrs-200)*100;
		}
		else if(empnohrs<200)
		{
			empgross=empgross - (200-empnohrs)*100;
		}
	}
	
	void display()
	{
		System.out.println("The name of the employee is : "+empname);
		System.out.println("The id of the employee is : "+empid);
		System.out.println("The salary of the employee is : "+empgross);
	}
}

public class prog1{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int i,n;
		System.out.println("Enter the number of employees : ");
		n=input.nextInt();
		Employee e[]=new Employee[n];
		for(i=0;i<n;i++)
		{
			e[i]=new Employee();
			e[i].getdata();
			e[i].calculate();
		}
		for(i=0;i<n;i++)
		{
			e[i].display();
		}
	}
}
