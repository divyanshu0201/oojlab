import java.util.Scanner;

public class Extraprog1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of elements in array : ");
		int n=input.nextInt();
		int a[]=new int[n];
		int i;
		System.out.println("Enter the array : ");
		for(i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		int c1=0,c2=0;
		for(i=0;i<n;i=i+2)
		{
			c1=c1+a[i];
		}
		for(i=1;i<n;i=i+2)
		{
			c2=c2+a[i];
		}
		System.out.print("The sum of even elements is : ");
		System.out.println(c1);
		System.out.print("The sum of odd elements is : ");
		System.out.println(c2);
		
	}
}
