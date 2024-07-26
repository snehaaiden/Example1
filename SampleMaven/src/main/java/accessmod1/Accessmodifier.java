package accessmod1;

public class Accessmodifier {
	
	 public int a=10;
	 public void display()
	{
		System.out.println("the value of a is= "+a);
	}

	public static void main(String[] args) {
		Accessmodifier obj= new Accessmodifier();
		obj.display();
	}

}
