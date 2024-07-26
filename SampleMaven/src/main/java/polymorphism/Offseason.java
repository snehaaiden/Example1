package polymorphism;
import java.util.Scanner;

public class Offseason  extends Onseason
{//child class
	public void discount(int total)
	{
		double Total=total*0.85;
		System.out.println("Total amount is "+total);
		System.out.println("Discount is 15%");
		System.out.println("Total amount after discount is = "+Total);
		}
	
	public void display()
	{
		super.discount(1000);
	}
	
	public Offseason()
	{ 
		Scanner sc= new Scanner(System.in);
		int num=0;
		 while(num<10)
			{
			 System.out.println("Enter the option");
				 num=sc.nextInt();
			switch(num)
			{
			case 1:
				this.discount(1000);
				break;
			case 2:
				this.display();
				break;
			default:System.out.println("Invalid option is entered");
		}
			}}
		public static void main(String[] args) {
		Onseason obj=new Offseason();

		}
		}
