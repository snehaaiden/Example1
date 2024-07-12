package inheritance;

public class Smalldog extends Dog {
	
	public void prints()
	{
		System.out.println("to");
		
	}

	public static void main(String[] args) {
		Smalldog obj=new Smalldog();
		
		obj.display();
		obj.printing();
		obj.prints();

	}

}
