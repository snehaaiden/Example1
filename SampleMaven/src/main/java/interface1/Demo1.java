package interface1;

public class Demo1 implements Sample1 { //implements interface
	
	public void display()// abstract method from interface
	{
		System.out.println("This is interface");
		System.out.println(MAX_VALUE);
	}
	public void print()// abstract method from interface
	
	{
		System.out.println("This is second method from interface");
	}
	
	public void demo()
	{
		System.out.println("This is demo");
	}

	public static void main(String[] args) {
		Demo1 obj= new Demo1();//child class object
		//Sample1 obj=new Demo1();// or upcasting
	
		obj.display();
		obj.print();
		obj.demo();//if not child class initiated methods of child class will be error
	}
}
