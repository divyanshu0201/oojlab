import java.util.Scanner;

class Operators{
	private double operand1;
	private double operand2;
	private double result1;
	private double result2;
	
	void getoperands()
	{
		Scanner xx=new Scanner(System.in);
		System.out.println("Enter the value of first operand : ");
		operand1=xx.nextDouble();
		System.out.println("Enter the value of the second operand : ");
		operand2=xx.nextDouble();
	}
	void addition(int i)
	{
		if(i==1)
			result1=operand1+operand2;
		else
			result2=operand1+operand2;
	}
	void subtraction(int i)
	{
		if(i==1)
			result1=operand1-operand2;
		else
			result2=operand1-operand2;
	}
	void multiplication(int i)
	{
		if(i==1)
			result1=operand1*operand2;
		else
			result2=operand1*operand2;
	}
	void division(int i)
	{
		if(i==1)
			result1=operand1/operand2;
		else
			result2=operand1/operand2;
	}
	void display()
	{
		System.out.println("The output of the first operation is : "+result1);
		System.out.println("The output of the second operation is : "+result2);
	}
}

public class prog7{
	public static void main(String args[])
	{
		Operators op=new Operators();
		op.getoperands();
		int n;
		Scanner xx=new Scanner(System.in);
		for(int i=1;i<=2;i++)
		{
			System.out.println("Enter the choice for "+i+" operation");
			System.out.println("Enter 1 for addition :");
			System.out.println("Enter 2 for subtraction :");
			System.out.println("Enter 3 for multiplication : ");
			System.out.println("Enter 4 for division : ");
			n=xx.nextInt();
			switch(n)
			{
				case 1:op.addition(i);
						break;
				case 2:op.subtraction(i);
						break;
				case 3:op.multiplication(i);
						break;
				case 4:op.division(i);
						break;
			}
		}
		op.display();
	}
}
