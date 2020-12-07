import java.util.Scanner;
class WrongAge extends Exception 
{ 
    public WrongAge(String s) 
    { 
        // Call constructor of parent Exception 
        super(s); 
    } 
}

class Father{
	int fatherAge;

	Father() {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter father's age : ");
		fatherAge = inp.nextInt();
	}
}

class Son extends Father{
	int sonAge;

	Son(){
		super();
		Scanner inp = new Scanner(System.in);
		try {
			if(fatherAge<=0) {
				throw new WrongAge("Age cannot be less than or equal to zero!!!");
			}
			else {
				System.out.print("Enter age of son : ");
				sonAge = inp.nextInt();
				try {
				if(sonAge>=fatherAge) {
					throw new WrongAge("Age of son cannot be greater than or equal to age of father!!!");
				}
				else {
					System.out.println("Entered ages are correct!");
				}
			}
				catch(WrongAge e) {
					System.out.println(e);
				}
			}
		}
		catch(WrongAge e) {
			System.out.println(e);
		}

		
	}
}

class ageException {
	public static void main(String[] args) {
		Son s = new Son();
	}
}
