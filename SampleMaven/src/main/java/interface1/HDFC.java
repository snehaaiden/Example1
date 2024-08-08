package interface1;//assignment
import java.util.Scanner;

public class HDFC implements RBI{
	
	public void recurringdeposit(double amt,int n)
	{
		double total=((amt*7.58)*n-1)/1-(1+I)*(-1/3);
		System.out.println(total);
		}
		
	public static void main(String[] args) {
		HDFC obj=new HDFC();
		Scanner sc= new Scanner(System.in);
		int i=0;
		int n;
		double amt;
		while(i<4)
		{
		System.out.println("Enter the amount for recurring deposit");
		
		amt=sc.nextInt();
		
		System.out.println("Enter the duration for recurring deposit ");
	
		n=sc.nextInt();
		System.out.println("Total amount depositing for n period of time");
		
		obj.recurringdeposit( amt, n);

	}
		i++;
		
		}
	
	

}
