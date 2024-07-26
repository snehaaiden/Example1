package abstraction;

public class Image extends Google {

	public void search()
	{
		System.out.println("This is the option to search");
	}
	
	public void show1()
	{
		System.out.println("This option is for image search");
	
	}
	public static void main(String[] args) {
		Image obj1=new Image();
		Video obj2= new Video();
		obj1.search();
		obj1.show1();
		obj2.show2();
		

	}

}
