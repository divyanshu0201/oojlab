import java.util.Scanner;


class Student
{
	private String usn;
	private String name;
	private int credits[];
	private double marks[];
	private int n;
	private double sgpa;
	private double totalcredits;

	void getdata()
	{
		int i;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of subjects ; ");
		n=input.nextInt();
		credits=new int[n];
		marks=new double[n];
		System.out.println("Enter the details of student : ");
		System.out.println("Enter the usn of student : ");
		usn=input.next();
		input.nextLine();
		System.out.println("Enter the name of student : ");
		name=input.next();
		System.out.println("Enter the credits of subject and marks : ");
		totalcredits=0;
		for(i=0;i<n;i++)
		{
			System.out.print("Enter the credit and marks of subject  ");
			System.out.println(i+1);
			credits[i]=input.nextInt();
			totalcredits=totalcredits+credits[i];
			if(totalcredits>25)
			{
				System.out.println("Total credits are more than 25 enter again ");
				totalcredits=totalcredits-credits[i];
				i--;
			}
			else
				marks[i]=input.nextDouble();
		}
	}
	void printdata()
	{
		System.out.println("The details of student : ");
		System.out.print("USN of student : ");
		System.out.println(usn);
		System.out.print("Name of student : ");
		System.out.println(name);
		System.out.print("SGPA of student : ");
		System.out.println(sgpa);
	}
	void calculate()
	{
		int i;
		int x;
		double sum=0,total=0;
		for(i=0;i<n;i++)
		{
			if(marks[i]>=90)
				x=10;
			else if(marks[i]>=80)
				x=9;
			else if(marks[i]>=70)
				x=8;	
			else if(marks[i]>=60)
				x=7;
			else if(marks[i]>=50)
				x=6;
			else if(marks[i]>=40)
				x=5;
			else
				x=0;
			sum=sum + credits[i]*x;
			total=total+credits[i];
		}
		sgpa=sum/total;
	}
}
public class labprog2{	
	public static void main(String[] args){
		Student s1=new Student();
		s1.getdata();
		s1.calculate();
		s1.printdata();
	}
}
