package Collection;

import java.util.ArrayList;

public class ArrayListex2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l1= new ArrayList<Integer>();//generic
		l1.add(5);
		l1.add(8);
		System.out.println(l1);
		System.out.println(l1.isEmpty());
		System.out.println(l1.size());
	
		ArrayList<Character> l2= new ArrayList<Character>();
		l2.add('o');
		l2.add('a');
		l2.add('b');
		System.out.println(l2);
		System.out.println(l2.isEmpty());
		System.out.println(l2.size());
		
		ArrayList<Float> l3= new ArrayList<Float>();
		l3.add(5.5f);
		l3.add(8.2f);
		l3.add(1.3f);
		System.out.println(l3);
		System.out.println(l3.isEmpty());
		System.out.println(l3.size());
		
		/*ArrayList<Byte> l3= new ArrayList<Byte>();
		l3.add(5);
		l3.add(1,7);
		l3.add(4);
		System.out.println(l3);
		System.out.println(l3.isEmpty());
		System.out.println(l3.size());
		*/

	}

}
