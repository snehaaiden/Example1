package polymorphism;

public class Car extends Vehicle {
	
	public void startEngine()
	{
		super.startEngine();
		System.out.println("This is start engine for car");
	}
	public void stopEngine()
	{
		super.stopEngine();
		System.out.println("This is stop engine for car");
	}

	public static void main(String[] args) {
		
		Vehicle obj= new Car();
		obj.startEngine();
		obj.stopEngine();
		Vehicle obj1= new Motorcycle();
		obj1.startEngine();
		obj1.stopEngine();
	}

}
