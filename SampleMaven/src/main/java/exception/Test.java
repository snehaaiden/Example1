package exception;

public class Test {
	
	public static void check(int age) throws LicenseException
	{
		if(age<18)
		{
			throw new LicenseException("Not eligible");
			
		}
		else
		{
			System.out.println("Eligible");
	}
		}
	

	public static void main(String[] args) {
		
try {
	check(20);
} catch (LicenseException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}