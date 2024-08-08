package exception;

public class Exceptionexample {

	public static void main(String[] args) {

		int a=10,b=40;
		int sum=a+b;
		System.out.println(sum);
		int arr[]=new int[5];
		
		try  //exception
		{
		arr[9]=23;
		int result=5/0;
		}
		/*catch(ArithmeticException e)//exception handling
		{
			System.out.println(e);// e is the object of Arithmetic exception class
			System.out.println("Division by zero is not possible");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("array size is only 5");
		}
		
		catch(Exception e)//exception class that handles 1st exception in the try block
		{
			System.out.println(e);
		}*/
	
		finally
		{
			System.out.println("code inside finally is always executed no matter the exception or handling exception");	
		}
		System.out.println("Rest of the code");
		

	}

}
