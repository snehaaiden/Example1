package inheritance;

public class bike extends vechile {
	
	public void display3()
	{
		System.out.println("to");
		
	}

	public static void main(String[] args) {
		bike obj=new bike();
		car obj1=new car();
		
		obj.display1();
		obj1.display2();
		obj.display3();
	


	}

}
