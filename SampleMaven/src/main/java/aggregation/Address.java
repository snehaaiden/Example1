package aggregation;

public class Address
{
	
	int housenumber;
	int pincode;
	String housename;
	String city;
	
	public Address(String housename,String city,int housenumber,int pincode)
	{
		this.housename=housename;
		this.city=city;
		this.housenumber=housenumber;
		this.pincode=pincode;
	}

}
