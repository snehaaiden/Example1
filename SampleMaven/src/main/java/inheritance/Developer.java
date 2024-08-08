package inheritance;

public class Developer extends Employee{

	public void printing()
	{
		System.out.println("Welcome"+a);
		
	}
	
	public static void main(String[] args) {
		
		Developer obj= new Developer();//child class obj
		obj.display();
		obj.printing();
		System.out.println(obj.a);
	}

}
