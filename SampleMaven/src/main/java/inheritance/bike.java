package inheritance;

public class bike extends vechile {
	
	public void display3()
	{
		System.out.println("to");
		
	}

	public static void main(String[] args) {
		bike obj=new bike();//childclass obj
		car obj1=new car();//childclass obj
		
		obj.display1();
		obj1.display2();
		obj.display3();
	
}

}
