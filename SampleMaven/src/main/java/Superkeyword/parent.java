package Superkeyword;

public class parent {
	int a=100;
	public void method1()
	{
		System.out.println("This is 1st method from parent");
		
	}
	
	public void method2()
	{
		System.out.println("This is 2nd method from parent");
		
	}
	public parent(int n1,int n2)
	{
		System.out.println("This is Parent constructor");
		int sum=n1+n2;
		System.out.println("Parent class sum= "+sum);
	}
	

}
