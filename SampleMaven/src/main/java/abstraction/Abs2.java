package abstraction;

public class Abs2  extends Abs1{
	public void show()//implementation of abstract method
	{
		System.out.println("Implementation of abstract method");
	}
	public void show1()
	{
		System.out.println("Method of child class");
	}
	public static void main(String[] args) {
		Abs2 obj= new Abs2();//obj for child class
		obj.display();
		obj.show();
		obj.show1();

	}

}
