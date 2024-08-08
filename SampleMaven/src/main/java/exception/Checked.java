package exception;

import java.io.IOException;//always import classes for checked exceptions

public class Checked {
	public static void M()throws IOException
	{
		throw new IOException("there is error");
	}

	public static void main(String[] args) {
		
	try {//as checked
		Checked.M();
	} catch (IOException e) {//handling exception
		// TODO Auto-generated catch block
		e.printStackTrace();//can show in red as try catch was generated
		//it can be removed when e.printStackTrace(); is removed
	
		
		//Checked.M();   throws IOException  along with mainfunction
		

	}
System.out.println("hello");
	}}
