import java.util.Scanner;

public class prog5{
	public static void main(String args[])
	{
		int n;
		Scanner xx=new Scanner(System.in);
		System.out.print("Enter the number of elements in the array : ");
		n=xx.nextInt();
		double array[]=new double[n];
		System.out.println("Enter the elements of the arrray : ");
		int i;
		for(i=0;i<n;i++)
		{
			array[i]=xx.nextDouble();
		}
		double neg[]=new double[n];
		double pos[]=new double[n];
		int count_neg=0,count_pos=0,count_zero=0;
		for(i=0;i<n;i++)
		{
			if(array[i]==0)
			{
				count_zero++;
			}
			else if(array[i]>0)
			{
				pos[count_pos]=array[i];
				count_pos++;
			}
			else
			{
				neg[count_neg]=array[i];
				count_neg++;
			}
		}
		System.out.println("The number of positive numbers are "+count_pos+" and they are : ");
		for(i=0;i<count_pos;i++)
		{
			System.out.println(pos[i]);
		}
		System.out.println("The number of negative numbers are "+count_pos+" and they are : ");
		for(i=0;i<count_neg;i++)
		{
			System.out.println(neg[i]);
		}
		System.out.println("The number of positive numbers are "+count_zero);
	}
}
