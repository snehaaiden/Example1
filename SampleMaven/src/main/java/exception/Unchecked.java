package exception;

public class Unchecked {
	public static void cal() throws ArithmeticException,ArrayIndexOutOfBoundsException
	{//throws can declare multiple exceptions
		int a=30;
		if(a!=30)
		{
			throw new ArithmeticException("ArithmeticException");
	}//throw canshow only single exception
		else
		{
			throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
		}
	}

	public static void main(String[] args) {
		
Unchecked.cal();
System.out.println("hai");
											}

}
