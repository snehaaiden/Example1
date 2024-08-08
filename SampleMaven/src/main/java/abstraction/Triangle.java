package abstraction;

public class Triangle extends Shape {
	
	public  void calculateArea(int b,int h)
	{
		System.out.println("The length of the triangle is"+b);
		System.out.println("The height of the triangle is"+h);
		double area=0.5*b*h;
		System.out.println("The area of the triangle is"+area);
		
		}
		public void calculatePerimeter(int b,int h,int c)
		{
			
			double perimeter=b+h+c;
			System.out.println("The perimeter of the circle is"+perimeter);
		}
}
