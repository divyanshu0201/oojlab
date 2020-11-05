import java.util.Scanner;

class Player{
	private int id;
	private String name;
	private int scores[];
	private int no_matches;
	
	Player()
	{
		no_matches=0;
		name="null";
		id=0;
	}
	void getdata()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the details of the player :");
		System.out.println("ENter the id of the player : ");
		id=input.nextInt();
		System.out.println("Enter the name of the player : ");
		name=input.next();
		input.nextLine();
		System.out.println("Enter the number of matches played by player : ");
		no_matches=input.nextInt();
		System.out.println("Enter the scores of the player : " );
		int i;
		scores=new int[no_matches];
		for(i=0;i<no_matches;i++)
		{
			scores[i]=input.nextInt();
		}
	
	}
	double calculate_average()
	{
		double average=0;
		int i;
		for(i=0;i<no_matches;i++)
		{
			average=average+scores[i];
		}
		average=average/no_matches;
		return average;
	}
}

public class lab2extraprog1{
	public static void main(String[] args){
		Player p1=new Player();
		Player p2=new Player();
		p1.getdata();
		p2.getdata();
		double avg1=p1.calculate_average();
		double avg2=p2.calculate_average();
		if(avg1>avg2)
			System.out.println("The player 1 has higher average : "+avg1);
		else
			System.out.println("The player 2 has higher average : "+avg2);
		
	}
}
