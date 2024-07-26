package Superkeyword;

public class child extends parent{

	int a=20;
	
	public child(int n1,int n2)
	{//super implicit call, so it will call parent class
		super(8,2);//needs to call if arguments have to be passed
		int sum=n1+n2;
		System.out.println("This is child constructor");
		System.out.println(a);// from child class
		System.out.println(super.a);//from parent class
		System.out.println("Child class sum="+sum);
	}
	
	public void method1()
	{
		super.method1();//that of parent method
		super.method2();//of parent method
		System.out.println("This is a child method");
		}
	
	public static void main(String[] args) 
	{
		child obj= new child(8,6);//child instructor created
		obj.method1();
		//obj.method2();
}

}
