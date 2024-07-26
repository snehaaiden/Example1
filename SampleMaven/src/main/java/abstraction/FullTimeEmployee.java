package abstraction;

public class FullTimeEmployee extends Employee {
	int hr=8;
	public void calculateSalary()
	{
		int totalsal=500*hr;
		System.out.println("Total Salary for full time employee is = "+totalsal);
	}

}
