package exception;

public class Throwexample {
	public static void check(int a,int b)
	{
		int sum=a+b;
		if(sum>40)
		{
			throw new ArithmeticException("sum greater than 40");
		}
		else
		{
			System.out.println("sum is less than 40");
		}
	}

	public static void main(String[] args) {
	try{
		
		check(20,10);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	//check(50,10);
	System.out.println("rest of code is executed");
		
	


	}

}
