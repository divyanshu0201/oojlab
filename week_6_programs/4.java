import java.util.Scanner;

public class prog31 {
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		int n=args.length;
		double arr[]=new double[n];
		int i,j;
		for(i=0;i<n;i++)
		{
			arr[i]=Double.parseDouble(args[i]);
		}
		double x;
		for(i=0;i<n;i++)
		{
			
			for(j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					x=arr[i];
					arr[i]=arr[j];
					arr[j]=x;
				}
			}
		}	
		System.out.println("Total marks : ");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}
}
