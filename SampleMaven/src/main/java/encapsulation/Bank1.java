package encapsulation;
import java.util.Scanner;
public class Bank1 {
	private int pin;
	
	public void setPin(int pin)
	{	
		this.pin = pin;
		}
	public void getPin() {
		System.out.println(pin);
	}
	public void validatepin()
	{
		if(pin==1001|| pin==1234 || pin==1212)
		{
			System.out.println("Valid PIN ...WITHDRAW AMOUNT ");
			System.out.println("Enter the amount to be withdrawn ");
			Scanner sc=new Scanner(System.in);
			int amount=sc.nextInt();
			System.out.println("The withdrawl amount is "+amount);
		}
		else
		{
			System.out.println("invalid pin");
		}
	}}