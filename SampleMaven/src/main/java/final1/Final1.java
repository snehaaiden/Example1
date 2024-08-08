package final1;

public final class Final1 { //final class cannot be extended to child class
	
	final int a=10;
	//a=20;
	final int c;//blank final variable or uninitialised final variable
	final int b=20;
	
	public Final1()
	{
		c=10; //blank final can be initialised in constructor
	}
	
	


public final void display() //final method cannot be overridden
{
	System.out.println(a);
}
	
}