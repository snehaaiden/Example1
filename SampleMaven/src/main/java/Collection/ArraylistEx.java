package Collection;
import java.util.ArrayList;//class
import java.util.Iterator;
import java.util.List;//interface


public class ArraylistEx {

	public static void main(String[] args) {
		System.out.println(" generic");
		List<String>l1=new ArrayList<String>();//generic(string typ)
		l1.add("sneha");
		l1.add("aiden");
		System.out.println(l1);
		//System.out.println(l1.isEmpty());
		
	/*	List l2=new ArrayList();//non generic
		l2.add("1");
		l2.add(2);
		System.out.println("non generic");
		System.out.println(l2);
		System.out.println(l2.isEmpty());
		System.out.println(l2.size());*/
		
		ArrayList l3= new ArrayList();//non generic
		l3.add("apple");
		l3.add("mango");
		System.out.println("next l3");
		System.out.println(l3);
		ArrayList<String> l4= new ArrayList<String>();//generic
		
		/*l4.add("apple");
		l4.add("orange");
		l4.add(0, "banana");
		l4.add("orange");
		l4.add(null);
		l4.add(null);
		System.out.println(l4);
		System.out.println(l4.contains("grapes"));//true or not
		
		l1.remove("sneha");
		System.out.println(l1);
		System.out.println(l1.get(1));//print 1st element
		System.out.println(l2);
		System.out.println(l2.set(1,"mango"));
		System.out.println(l2);
		
		System.out.println("In for loop");
		
		for(int i=0;i<l4.size();i++)
		{
			System.out.println(l4.get(i));
		}
		System.out.println("for each loop");
		
		for(String j:l4) //for each loop
				{
			System.out.println(j);
		}*/
		
		System.out.println("iterator");
		Iterator<String> itr=l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("iterator remove");
	
		itr.remove();//last element is removed from list
		System.out.println(l1);
		
		/*System.out.println(l4);
		Iterator<String> itr=l4.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("iterator remove");
		itr.remove();
		System.out.println(l4);*/
		

	}

}
