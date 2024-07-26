package interface1;
import java.util.Scanner;

public class HDFC {

	public void recurringdeposit()
	{
		Scanner sc= new Scanner(System.in);
		int i=0;
		while(i<4)
		{
		System.out.println("Enter the amount for recurring deposit");
		
		double amt=sc.nextInt();
		
		System.out.println("Enter the duration for recurring deposit ");
	
		int n=sc.nextInt();
		System.out.println("Total amount depositing for n period of time");
		
		double total=((amt*7.58)*n-1)/1-(1+6.58)*(-1/3);
		System.out.println(total);
		}
		i++;
	}
	
	public static void main(String[] args) {
		HDFC obj=new HDFC();
		obj.recurringdeposit();

	}

}
