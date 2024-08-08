package interface1;

public class Dog implements Animal {
	
	public void bark() 
	{
		System.out.println("Abstract method from abstract class");	
	}
	public void speak()
	{
		System.out.println("Dog is barking from abstract class");
		
	}
	public void speak(int n)
	{
		System.out.println("Dog is barking");
	}
	public static void main(String[] args) {
		
		Dog obj=new Dog();
		obj.bark();
		obj.speak();
		obj.speak(1);
		}}
