import java.util.Scanner;

public class extraprog4{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n,i,a[];
		System.out.println("Enter the number of elements in array : ");
		n=input.nextInt();
		a=new int[n];
		System.out.println("Enter the elements of array : ");
		for(i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		int b[],c[];
		b=new int[n];
		c=new int[n];
		int bcount=0,ccount=0;
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				b[bcount]=a[i];
				bcount++;
			}
			else
			{
				c[ccount]=a[i];
				ccount++;
			}
		}
		double sum=0,average=0,min=c[0],max=0;
		for(i=0;i<ccount;i++)
		{
			sum=sum+c[i];
			if(min>c[i])
				min=c[i];
			if(max<c[i])
				max=c[i];
		}
		average=sum/ccount;
		System.out.println("The sum of odd array is : "+sum);
		System.out.println("The average of odd array is : "+average);
		System.out.println("The max element of odd array is : "+max);
		System.out.println("The min element of odd array is : "+min);
	}
}
