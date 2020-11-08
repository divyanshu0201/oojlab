import java.util.Scanner;

class Age{
	private int years,months;
	
	void getdata()
	{
		Scanner xx=new Scanner(System.in);
		System.out.print("Enter the years  : " );
		years=xx.nextInt();
		System.out.print("Enter the months : ");
		months=xx.nextInt();
	}
	int calculate()
	{
		return ((years*12)+months);
	}
}

public class prog2{
	public static void main(String args[])
	{
		Age a[]=new Age[2];
		int i;
		for(i=0;i<2;i++)
		{
			a[i]=new Age();
			System.out.println("Enter the age of "+(i+1)+" person : ");
			a[i].getdata();
			
		}
		if(a[0].calculate()==a[1].calculate())
		{
			System.out.println("The age of both persons is equal");
		}
		else if(a[0].calculate()>a[1].calculate())
		{
			System.out.println("The age of 1st person is more than 2nd person");
		}
		else
		{
			System.out.println("The age of 2nd person is more than 1st person");
		}
	}
}
