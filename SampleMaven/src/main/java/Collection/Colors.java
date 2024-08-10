package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Colors {

	public static void main(String[] args) {
		
		ArrayList <String>l1= new ArrayList<String>();
		l1.add("green");
		l1.add("yellow");
		l1.add("orange");
		l1.add("red");
		l1.add("violet");
		System.out.println(l1);//printing list
		
		System.out.println(l1.get(1));//retrieve an element (at a specified index)
		
		System.out.println("iterator");
		Iterator<String> itr=l1.iterator();//iterate through all elements 
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		l1.remove(3); // remove the third element 
		System.out.println(l1);
		System.out.println(l1.contains("green"));//to search an element
		
		}}
