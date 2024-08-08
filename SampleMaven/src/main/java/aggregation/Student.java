package aggregation;

public class Student {
	String name;
	int rollno;
	
	Address adr;//entity reference variable for class
	public Student(String name,int rollno,Address adr)
	{
		this.name=name;
		this.rollno=rollno;
		this.adr=adr;
	}
	
	public void display()
	{
		System.out.println("The name is"+name);
		System.out.println("The roll number is"+rollno);
		System.out.println("The house name is"+adr.housename);
		System.out.println("The  city is"+ adr.city);
		System.out.println("The housenumber is"+adr.housenumber);
		System.out.println("The pincode is"+adr.pincode);
	}
	public static void main(String[] args) 
	{
		Address obj1= new Address("Home","Ekm",125,6820);
		Student obj2=new Student("Sneha",987,obj1);
		obj2.display();

	}

}
