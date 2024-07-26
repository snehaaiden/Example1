package encapsulation;

public class User {

	public static void main(String[] args) {
		Bank1 obj= new Bank1();//local aggregation
		obj.setpin();
		obj.setA(1001);
		obj.setB(1234);
		obj.setC(1212);
		System.out.println("Valid pin one ="+obj.getA());
		System.out.println("Valid pin two ="+obj.getB());
		System.out.println("Valid pin three ="+obj.getC());
		}
}
