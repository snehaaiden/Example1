package encapsulation;

public class Demo1 {
	

	public static void main(String[] args) {
	Customer obj= new Customer();//local aggregation
	obj.setAcno(345);
	obj.setMail("snehamail");
	obj.setBalance(1000);
	System.out.println("account number"+obj.getAcno());
	System.out.println("Mail id is "+obj.getMail());
	System.out.println("Balance is "+obj.getBalance());
	

	}

}
