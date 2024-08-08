package encapsulation;

public class Company {

	public static void main(String[] args) {
		Car obj=new Car();
		
		obj.setCompany_name("Tata");
		obj.setModel_name("Sumo");
		obj.setYear(2000);
		
		
		System.out.println("The Company name is"+obj.getCompany_name());
		System.out.println("The Model name is"+obj.getModel_name());
		System.out.println("The mileage in kmpl is"+obj.getMileage());
		System.out.println("The year is"+obj.getYear());
		;

	}}
