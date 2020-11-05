import java.util.Scanner;

class Actor{
	private int id;
	private String name;
	private int no_of_years_exp;
	private int no_of_movies;
	
	Actor()
	{
		no_of_movies=0;
		name="null";
		id=0;
		no_of_years_exp=0;
	}
	void getdata()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the details of the actor :");
		System.out.println("Enter the id of the actor : ");
		id=input.nextInt();
		System.out.println("Enter the name of the actor : ");
		name=input.next();
		input.nextLine();
		System.out.println("Enter the number of movies done by the actor : ");
		no_of_movies=input.nextInt();
		System.out.println("Enter the number of years experienced : " );
		no_of_years_exp=input.nextInt();	
	}
	int returnperformance()
	{
		return ((no_of_movies)/no_of_years_exp);
	}
	void printdata()
	{
		System.out.println("The name of the player with thw highest average is "+name);
	}
}

public class prog3{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of actors : ");
		int n=input.nextInt();
		int i;
		Actor a[]=new Actor[n];
		for(i=0;i<n;i++)
		{
			a[i]=new Actor();
			a[i].getdata();
		}
		int k=0,max=a[0].returnperformance();
		for(i=1;i<n;i++)
		{
			if(a[i].returnperformance()>max)
			{
				max=a[i].returnperformance();
				k=i;
			}	
		}
		a[k].printdata();
		
	}
}
