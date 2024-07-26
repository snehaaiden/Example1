package interface1;

public class InterFac implements InterF1,InterF2{

	
		public  void displays1()
		{
			System.out.println("This is display1 and the constant is");
			System.out.println(Min_VALUE);
		}
		
		public  void displays2()
		{
			System.out.println("This is display2 and the constant is");
			System.out.println(MAXs_VALUE);
		}

		public static void main(String[] args) {
			
			InterFac obj= new InterFac();
			obj.displays1();
			obj.displays2();
	}


}
