package abstraction;

public class HDFC extends Bank {
	
	public void interest()
	{
		System.out.println("this is abstract method implementation");
	}

	public void display1()
	{
		System.out.println("this is of class HDFC");
	}
	public static void main(String[] args) {
		HDFC obj= new HDFC();
		ICC obj1= new ICC();
		FEDERAL obj2=new FEDERAL();
		
		obj.interest();
		obj.display1();
		obj1.interest();
		obj2.interest();
	}

}
