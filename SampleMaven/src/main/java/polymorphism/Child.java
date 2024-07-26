package polymorphism;

public class Child extends Parent{
	public void method1(int c,int d)
	{
		super.method1(1,2);
		int s=c+d;
		System.out.println("sum="+s);
	}
	
		public static void main(String[] args) {
		Parent obj= new Child();//parent created objected
		obj.method1(8,2);

	}

}
