package abstraction;

public class Circle extends Shape {
	
	public void calculateArea(int r,int h)
	{
	System.out.println("The radius of the circle is"+r);
	
	double area=3.14*r*r;
	System.out.println("The area of the circle is"+area);
	
	}
	public void calculatePerimeter(int r,int h,int c)
	{
		System.out.println("The radius of the circle is"+r);
		
		double perimeter=2*3.14*r;
		System.out.println("The perimeter of the circle is"+perimeter);
	}
	public static void main(String[] args) {
		
		Circle obj1=new Circle();
		obj1.calculateArea(5,0);
		obj1.calculatePerimeter(5,0,0);
		Triangle obj2=new Triangle();
		obj2.calculateArea(6,2);
		obj2.calculatePerimeter(6,2,3);
	}
}
