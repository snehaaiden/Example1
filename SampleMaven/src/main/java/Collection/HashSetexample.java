package Collection;


import java.util.HashSet;
import java.util.Iterator;

import java.util.Set;

public class HashSetexample {

	private static final String Iterator = null;

	public static void main(String[] args) {
		System.out.println(" generic");
		Set<String>l1=new HashSet<String>();//generic(string typ)
		l1.add("sneha");
		l1.add("aiden");
		l1.add("aiden");//no duplicate can be added
		l1.add("null");
		l1.add("null");//only one null is possible
		System.out.println(l1);
		
		HashSet<String>l2=new HashSet<String>();
		l2.add("sneha");
		l2.add("aiden");
		System.out.println(l2);
		
		HashSet l3=new HashSet();
		l3.add("hai");
		l3.add(45);
		System.out.println(l3);
		
		l1.remove("sneha");
		System.out.println(l1);
		
		System.out.println(l1.size());
		System.out.println(l1.contains("aiden"));
		
		
		Iterator<String> it=  l1.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
	l1.addAll(l2);
	System.out.println(l1);
	
	l1.removeAll(l2);
	System.out.println(l1);
	
	System.out.println(l2.contains("aiden"));
	}
	

}
