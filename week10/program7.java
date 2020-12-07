import java.util.Scanner;

class Test<T> {
	T obj;

	Test(T obj) {
		this.obj = obj;
	}

	void display() {
		System.out.println("Type of T : " +obj.getClass().getName());
	}

	T getObject() {
		return obj;
	}
}

class generic{
	public static void main(String[] args) {
		Test<Integer> i = new Test<Integer>(15);
		i.display();
		System.out.println("Value : "+i.getObject());
		

		Test<Double> d = new Test<Double>(215.14);
		d.display();
		System.out.println("Value : "+d.getObject());
		
		Test<String> s = new Test<String>("Hello World!");
		s.display();
		System.out.println("Value : "+s.getObject());
	}
}
