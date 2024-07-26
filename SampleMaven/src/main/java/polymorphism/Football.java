package polymorphism;

public class Football extends Game {
	public void play()
	{
			super.play();
		System.out.println("This is football game");
	}

	public static void main(String[] args) {
		
		Game obj;//adv of upcasting method is that single object is only required  for parent class
		obj=new Football();
		obj.play();//so only single object needed so its easy
		obj=new Cricket();
		obj.play();//calling instance method
		obj=new Hockey();
		obj.play();
		//Game obj= new Football();
		//obj.play();
		//Game obj1=new Cricket();
		//obj1.play();
		//Game obj2=new Hockey();
		//obj2.play();
	}

}
