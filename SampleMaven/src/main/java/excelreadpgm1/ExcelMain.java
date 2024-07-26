package excelreadpgm1;

import java.io.IOException;
public class ExcelMain {

	public static void main(String[] args) throws IOException
	{
		String s=ExcelCode.readStringData(0,1);
		System.out.println(s);
		String s1=ExcelCode.readIntegerData(1,1);
		System.out.println(s1);
//output shows first line error becoz of version 5.2.3
	}

}
