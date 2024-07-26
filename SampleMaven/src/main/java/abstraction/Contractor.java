package abstraction;

public class Contractor extends Employee {
	
	public void calculateSalary()
	{
		System.out.println("This is abstract method from employee superclass");
	}
	public void calculateSalary(int hrs)
	{
		int totalsal=500*hrs;
		System.out.println("Total Salary for contractor is = "+totalsal);
	}

	public static void main(String[] args) {
		
		Contractor obj1=new Contractor();
		FullTimeEmployee obj2=new FullTimeEmployee();
		obj1.calculateSalary();
		obj1.calculateSalary(5);
		obj2.calculateSalary();
		

	}

}
