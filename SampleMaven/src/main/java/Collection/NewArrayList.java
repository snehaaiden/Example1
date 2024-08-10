package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewArrayList {

	public static void main(String[] args) {
		List l1=new ArrayList();//non generic
		l1.add("sneha");
		l1.add("aiden");
		l1.add(55);
		System.out.println(l1);
		
		//System.out.println(l1.isEmpty());
		System.out.println("Non generic collection");
		
		ArrayList l2= new ArrayList();//non generic
		l2.add(53);
		l2.add(5.6f);
		l2.add("hello");
		System.out.println(l2);
		
		l1.addAll(l2);//to add l2 to l1
		System.out.println(l1);
		
		List<String>l3=new ArrayList<String>();//generic(string typ)
		l3.add("hello");
		l3.add("welcome");
		System.out.println(l3);
		
		List<String>l4=new ArrayList<String>();//generic(string typ)
		l4.add("hai");
		l4.add("be happy");
		System.out.println(l4);
		l3.addAll(l4);
		System.out.println(l3);
		
		Collections.sort(l3);
		System.out.println("sorted list"+l3);
		
		l3.removeAll(l4);//to remove
		System.out.println("removed list"+l3);
		
		System.out.println(l3.contains("hello"));//contains or not
	}

}
