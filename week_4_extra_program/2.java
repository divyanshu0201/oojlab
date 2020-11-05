import java.util.Scanner;

class Book
{
	private int bookid;
	private String booktitle;
	private int no_of_pages;
	private int year_of_pub;
	private String author;
	private String publisher;
	private double price;
	
	void getdata(int n)
	{
		Scanner xx=new Scanner(System.in);
		System.out.println("Enter the details of " +n+ " book :");
		System.out.print("Enter the book id : ");
		bookid=xx.nextInt();
		System.out.print("Enter the book title : ");
		booktitle=xx.next();
		xx.nextLine();
		System.out.print("Enter the number of pages in book : ");
		no_of_pages=xx.nextInt();
		System.out.print("Enter the year of publication : ");
		year_of_pub=xx.nextInt();
		System.out.print("Enter the author : ");
		author=xx.next();
		xx.nextLine();
		System.out.print("Enter the publisher : ");
		publisher=xx.next();
		xx.nextLine();
		System.out.print("Enter the price : ");
		price=xx.nextDouble();
	}
	void printdata()
	{
		System.out.println("The details of the book are : ");
		System.out.println("Book id : "+bookid);
		System.out.println("Book title : "+booktitle);
		System.out.println("Number of pages : "+no_of_pages);
		System.out.println("Year of publication : "+year_of_pub);
		System.out.println("Author : "+author);
		System.out.println("Publisher : "+publisher);
		System.out.println("Price : "+price);
	}
	int checkauthor(String str)
	{
		if(str.compareTo(author)==0)
			return 1;
		return 0;
	}
	double checkbookprice()
	{
		return price;
	}
	int checkyear(int y)
	{
		if(year_of_pub==y)
			return 1;
		return 0;
	}
	int checkpages()
	{
		return no_of_pages;
	}
	void printmaxprice()
	{
		System.out.println(booktitle);
	}
}
public class lab2extraprog2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter teh number of books : ");
		int n=input.nextInt();
		Book b[]=new Book[n];
		int i;
		for(i=0;i<n;i++)
		{
			b[i]=new Book();
			b[i].getdata(i+1);
		}
		System.out.println("Enter the name of the author whose book details to be displayed :");
		String at=input.next();
		input.nextLine();
		for(i=0;i<n;i++)
		{
			if(b[i].checkauthor(at)==1)
				b[i].printdata();
			
		}
		double maxprice=0;
		int k=0;
		for(i=0;i<n;i++)
		{
			if(b[i].checkbookprice()>maxprice)
			{
				maxprice=b[i].checkbookprice();
				k=i;
			}
		}
		System.out.println("The title of the book which is most expensive is : ");
		b[k].printmaxprice();
		int count=0;
		for(i=0;i<n;i++)
		{
			
		}
	}
}
