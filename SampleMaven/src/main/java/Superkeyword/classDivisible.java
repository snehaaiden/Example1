package Superkeyword;

public class classDivisible extends classAdd {
	

	
	
	public void method1(int a,int b)
	{
	int result=super.sum(a,b);//parent function returns a value
		System.out.println("The sum is from child"+result);
		if(result%10==0)
			System.out.println("The number is divisible by 10");
		else
			System.out.println("The number is not divisible by 10");
	}
	
		public static void main(String[] args) 
	{
		classDivisible obj= new classDivisible();//child constructor created
		obj.method1(3,2);
	
}
}