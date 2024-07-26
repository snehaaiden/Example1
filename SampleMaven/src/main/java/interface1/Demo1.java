package interface1;

public class Demo1 implements Sample1 {
	
	public void display()
	{
		System.out.println("This is interface");
		System.out.println(MAX_VALUE);
	}
	
	public void demo()
	{
		System.out.println("This is demo");
	}

	public static void main(String[] args) {
		Demo1 obj= new Demo1();//upcasting
		obj.display();
		obj.demo();
	}
}
