package aggregation;

public class Book {
	
	String bookname;
	int edition;
	int year;
	
	Author auth;
	public Book(String bookname,int edition,int year,Author auth)
	{
		this.bookname=bookname;
		this.edition=edition;
		this.year=year;
		this.auth=auth;// reference class
	}
	public void display()
	{
		System.out.println("The book name is"+bookname);
		System.out.println("The edition is"+edition);
		System.out.println("The year is"+year);
		System.out.println("The author name is"+auth.name);
		System.out.println("The  place is"+ auth.place);
	
	}

	public static void main(String[] args) {
		
		Author obj2=new Author("Roald Dahl","America");
		Book obj1=new Book("Matilda",50,1950,obj2);
		obj1.display();
}
}
