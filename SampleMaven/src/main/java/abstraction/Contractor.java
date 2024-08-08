package abstraction;

public class Contractor extends Employee {
	
	
	public void calculateSalary()
	{	
		int totalsal=500*hr;
		System.out.println("Total Salary for contractor is = "+totalsal);
	}

	public static void main(String[] args) {
		
		Contractor obj1=new Contractor();
		FullTimeEmployee obj2=new FullTimeEmployee();
		obj1.calculateSalary();
	
		obj2.calculateSalary();
		

	}

}
