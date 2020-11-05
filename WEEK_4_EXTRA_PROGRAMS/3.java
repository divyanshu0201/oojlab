import java.util.Scanner;

public class extraprog3{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of items : ");
		int n=input.nextInt();
		double itemprice[],total=0;
		int noofitem[];
		itemprice=new double[n];
		noofitem=new int[n];
		int i;
		System.out.println("Enter the price and number of products : ");
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the price and numbet of items for " +(i+1)+ "product");
			itemprice[i]=input.nextDouble();
			noofitem[i]=input.nextInt();
			total=total+itemprice[i]*noofitem[i];
		}
		if(total>=10000)
			total=total-(total*0.05);
		else if(total>=7500)
			total=total-(total*0.03);
		else if(total>=5000)
			total=total-(total*0.02);
		System.out.println("The total amount of the bill is " +total);
	}
}
