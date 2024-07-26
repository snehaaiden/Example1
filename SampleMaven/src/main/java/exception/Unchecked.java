package exception;

public class Unchecked {
	public static void cal() throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		int a=30;
		if(a!=30)
		{
			throw new ArithmeticException();
	}
		else
		{
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public static void main(String[] args) {
		
Unchecked.cal();
	}

}
