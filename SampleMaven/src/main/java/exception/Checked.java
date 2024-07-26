package exception;

import java.io.IOException;

public class Checked {
	public static void M()throws IOException
	{
		throw new IOException("there is error");
	}

	public static void main(String[] args) {
		
	try {
		Checked.M();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		

	}

}
