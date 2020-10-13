import java.util.Scanner;

class Book{
	private String name;
	private String author;
	private double price;
	private int num_pages;
	
	Book(String s,String a,double p,int n)
	{
		name=s;
		author=a;
		price=p;
		num_pages=n;
	}
	Book()
	{
		name="NULL";
		author="NULL";
		price=0;
		num_pages=0;
	}
	void setdata()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the name of the book : ");
		name=input.next();
		input.nextLine();
		System.out.println("Enter the author of the book : ");
		author=input.next();
		input.nextLine();
		System.out.println("Enter the price of the book : ");
		price=input.nextDouble();
		System.out.println("Enter the number of pages in the book : ");
		num_pages=input.nextInt();
	}
	void getdata()
	{
		System.out.println("The name of the book is : "+name);
		System.out.println("The author of the book is : "+author);
		System.out.println("The price of the book is : "+price);
		System.out.println("Number of pages in the book are : "+num_pages);
	}
	
	public String toString()
	{
		return("name of the book : "+name+"\nauthor of the book : "+author+"\nprice of the book : "+price+"\nnumber of pages in the book : "+num_pages);
	}
}

public class labp3{
	public static void main(String args[]){
		Scanner xx=new Scanner(System.in);
		System.out.println("Enter the number of books : ");
		int n=xx.nextInt();
		Book b[]=new Book[n];
		int i;
		System.out.println("Enter the details of the book : ");
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the details of the "+(i+1)+" book");
			b[i]=new Book();
			b[i].setdata();
		}
		System.out.println("The details of the books are : ");
		for(i=0;i<n;i++)
		{
			System.out.println("The details of the "+(i+1)+" book is : ");
			System.out.println(b[i]);
		}
	}	
}
