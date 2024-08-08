package inheritance;

public class Smalldog extends Dog {  //multilevel inheritance
	
	public void prints()
	{
		System.out.println("to");
		
	}

	public static void main(String[] args) {
		Smalldog obj=new Smalldog(); //childclass obj initialised
		
		obj.display();
		obj.printing();
		obj.prints();

	}
}
