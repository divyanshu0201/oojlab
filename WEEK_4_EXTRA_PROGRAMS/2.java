import java.util.Scanner;

public class Extraprog2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of elements in array : ");
		int n=input.nextInt();
		int i;
		int a[]=new int[n];
		System.out.println("Enter the array :");
		for(i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		int count1=0,count2=0,count3=0;
		for(i=0;i<n;i++)
		{
			if(a[i]>0)
				count1++;
			else if(a[i]==0)
				count2++;
			else
				count3++;
		}
		System.out.print("Number of positive elemets in array are : ");
		System.out.println(count1);
		System.out.print("Number of zero elemets in array are : ");
		System.out.println(count2);
		System.out.print("Number of negative elemets in array are : ");
		System.out.println(count3);
			
	}
}
