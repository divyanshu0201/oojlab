import java.util.Scanner;

class Person{
	private int year_of_birth;
	Person()
	{
		Scanner xx=new Scanner(System.in);
		System.out.print("Enter the year of birth of person : ");
		year_of_birth=xx.nextInt();
	}
	int getyearbirth()
	{
		return year_of_birth;
	}
}

class Employee extends Person{
	private int emp_id;
	Employee()
	{
		Scanner xx=new Scanner(System.in);
		System.out.print("Enter the id number of the employeee : ");
		emp_id=xx.nextInt();
	}
	int getempid()
	{
		return emp_id;
	}
}

class Student extends Person{
	private int student_id;
	Student()
	{
		Scanner xx=new Scanner(System.in);
		System.out.print("Enter the id number of the student : ");
		student_id=xx.nextInt();
	}
	int getstudentid()
	{
		return student_id;
	}
}

class Teaching extends Employee{
	private String name;
	private String subject;
	Teaching()
	{
		Scanner xx=new Scanner(System.in);
		System.out.print("Enter the name of the teacher : ");
		name=xx.nextLine();
		xx.nextLine();
		System.out.print("Enter the subject of the teacher : ");
		subject=xx.nextLine();
		xx.nextLine();
	}
	void display()
	{
		System.out.println("The year of birth of the teachet is  : "+getyearbirth());
		System.out.println("The id of the teacher is  : "+getempid());
		System.out.println("The name of the teacher is : "+name);
		System.out.println("The subject of the teacher is  "+subject);
	}
}

class Non_Teaching extends Employee{
	private String name;
	private String job;
	Non_Teaching()
	{
		Scanner xx=new Scanner(System.in);
		System.out.print("Enter the name of the staff member : ");
		name=xx.nextLine();
		xx.nextLine();
		System.out.print("Enter the job of the staff : ");
		job=xx.nextLine();
		xx.nextLine();
	}
	void display()
	{
		System.out.println("The year of birth of the staff is  : "+getyearbirth());
		System.out.println("The id of the staff is  : "+getempid());
		System.out.println("The name of the staff is : "+name);
		System.out.println("The job of the staff is  "+job);
	}
}

class UG extends Student{
	private String name;
	private int sem;
	private String branch; 
	UG()
	{
		Scanner xx=new Scanner(System.in);
		System.out.print("Enter the name of the student : ");
		name=xx.nextLine();
		xx.nextLine();
		System.out.print("Enter the semester of the student : ");
		sem=xx.nextInt();
		System.out.print("Enter the branch of the student : ");
		branch=xx.nextLine();
		xx.nextLine();
	}
	void display()
	{
		System.out.println("The year of birth of the student is  : "+getyearbirth());
		System.out.println("The id of the student is  : "+getstudentid());
		System.out.println("The name of the student is : "+name);
		System.out.println("The semester of the student is  "+sem);
		System.out.println("The branch of the student is : "+branch);
	}
}

class PG extends Student{
	private String name;
	private int year;
	private String branch; 
	PG()
	{
		Scanner xx=new Scanner(System.in);
		System.out.print("Enter the name of the student : ");
		name=xx.nextLine();
		xx.nextLine();
		System.out.print("Enter the year of the student : ");
		year=xx.nextInt();
		System.out.print("Enter the branch of the student : ");
		branch=xx.nextLine();
		xx.nextLine();
	}
	void display()
	{
		System.out.println("The year of birth of the student is  : "+getyearbirth());
		System.out.println("The id of the student is  : "+getstudentid());
		System.out.println("The name of the student is : "+name);
		System.out.println("The year of the student is  "+year);
		System.out.println("The branch of the student is : "+branch);
	}
}

public class prog21{
	public static void main(String args[])
	{
		int no_of_teachers,no_of_staff,no_of_ug_students,no_of_pg_students;
		Scanner xx=new Scanner(System.in);
		System.out.print("Enter the number of teachers : ");
		no_of_teachers=xx.nextInt();
		System.out.print("Enter the number of non-teaching staff : ");
		no_of_staff=xx.nextInt();
		System.out.print("Enter the number of ug students : ");
		no_of_ug_students=xx.nextInt();
		System.out.print("Enter the number of pg students : ");
		no_of_pg_students=xx.nextInt();
		int i;
		Teaching t[]=new Teaching[no_of_teachers];
		Non_Teaching nt[]=new Non_Teaching[no_of_staff];
		UG u[]=new UG[no_of_ug_students];
		PG p[]=new PG[no_of_pg_students];
		System.out.println("Enter the details of the teachers : ");
		for(i=0;i<no_of_teachers;i++)
		{
			t[i]=new Teaching();
		}
		System.out.println("Enter the details of the non-teaching staff : ");
		for(i=0;i<no_of_staff;i++)
		{
			nt[i]=new Non_Teaching();
		}
		System.out.println("Enter the details of the ug students : ");
		for(i=0;i<no_of_ug_students;i++)
		{
			u[i]=new UG();
		}
		System.out.println("Enter the details of the pg students : ");
		for(i=0;i<no_of_pg_students;i++)
		{
			p[i]=new PG();
		}
		System.out.println("The details of the teacher are : ");
		for(i=0;i<no_of_teachers;i++)
		{
			t[i].display();
		}
		System.out.println("The details of the staff are : ");
		for(i=0;i<no_of_staff;i++)
		{
			nt[i].display();
		}
		System.out.println("The details of the ug students are : ");
		for(i=0;i<no_of_ug_students;i++)
		{
			u[i].display();
		}
		System.out.println("The details of the pg students are : ");
		for(i=0;i<no_of_pg_students;i++)
		{
			p[i].display();
		}
	}
}
