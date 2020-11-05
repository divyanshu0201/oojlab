import java.util.Scanner;

public class prog1{
	public static void main(String args[]){
		int m,n;
		Scanner xx=new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		m=xx.nextInt();
		System.out.print("Enter the number of colums : ");
		n=xx.nextInt();
		int[][] matrix=new int[m][n]; 
		int[][] inverse=new int[n][m]; 
		int i,j,temp;
		System.out.println("Enterthe elements : ");
		for(i=0;i<m;i++)
		{
			System.out.println("Enter the elements of "+(i+1)+" row : ");
			for(j=0;j<n;j++)
			{
				matrix[i][j]=xx.nextInt();
			}
		}
		for(j=0;j<n;j++)
		{
			for(i=0;i<m;i++)
			{
				inverse[j][i]=matrix[i][j];
			}
		}
		System.out.println("The inverse matrix is : ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(inverse[i][j]+" ");
			}
			System.out.println();
		}
	}
}
