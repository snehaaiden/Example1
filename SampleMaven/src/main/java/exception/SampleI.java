package exception;

public class SampleI {

	public static void main(String[] args) 
	{
	
		int a=10;
		int b=100;
		int s=a+b;
		int d[]=new int[5];
		
		try
		{
			d[6]=1;
			int result =5/0;	//exception
			
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("Exception handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array is handled");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		finally
		{
			System.out.println("final block will always be executed");
			}
	
		
		System.out.println("Rest of the code is dosplayed");

	}

}
