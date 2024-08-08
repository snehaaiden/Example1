package encapsulation;

public class User {

	public static void main(String[] args) {
		Bank1 obj= new Bank1();//local aggregation
		
		obj.setPin(1001);
		obj.validatepin();
		}
}
