package inheritance;
import java.util.Scanner;

	public class salary1
	{
	double basicPay;
	double deduction;
	double bonus;

	public void getDetails()//get details in a method using scanner
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the basic pay");
		basicPay=sc.nextDouble();
		
		System.out.println("Enter the deduction");
		deduction=sc.nextDouble();
		
		System.out.println("Enter the bonus");
		bonus=sc.nextDouble();
		
		//sc.close();
	}
	}
 
