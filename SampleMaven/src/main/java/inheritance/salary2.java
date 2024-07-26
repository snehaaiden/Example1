package inheritance;


	public class salary2 extends salary1//calculate class to get the basic pay extend
	{
		double hra;
		double Totalsal;
		double pf;
		
		public void calculateHP()
		{
			hra=0.05*basicPay;
			pf=0.20*basicPay;
		
			Totalsal =( basicPay + hra - pf - deduction + bonus);
		}
	}
