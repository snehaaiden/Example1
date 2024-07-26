package polymorphism;

public class Onseason {//parent class
	public void discount(int total)
	{
	
		double Total=total*0.60;
		System.out.println("Total amount is "+total);
		System.out.println("Discount is 40%");    
		System.out.println("Total amount after discount is = "+Total);
		
	}
	
	public void display()
	{
		this.discount(1000);
	}

}
