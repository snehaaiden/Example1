package inheritance;

public class salary3 extends salary2
{
	public void generateSlip()
	{
		calculateHP();
		System.out.println("Payslip:");
		System.out.println("Basic Pay:"+ basicPay);
		System.out.println("Deduction:"+ deduction);
		System.out.println("HRA:"+hra);
		System.out.println("PF"+pf);
		System.out.println("Bonus"+bonus);
		System.out.println("Total salary"+Totalsal);
	}

	
	
	public static void main(String[] args)
	{
		salary3 obj=new salary3();
		
		obj.getDetails();
		obj.generateSlip();
	}
		
	}



