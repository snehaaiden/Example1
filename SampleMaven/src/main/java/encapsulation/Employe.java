package encapsulation;

public class Employe {

	private String name;
	private String designation;
	private int salary;
	//private int age;
	
	public void setter(String name,String designation,int salary)//to set values
	{
		this.name=name;
		this.designation=designation;
		this.salary=salary;
	}
	public void getter()
	{
		System.out.println("The name is "+name);
		System.out.println("The designation is "+designation);
		System.out.println("The salary is "+salary);
	}
}
