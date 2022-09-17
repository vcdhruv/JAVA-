/*Declare a class called book having author_name as private data member. Extend book
class to have two sub classes called book_publication & paper_publication. Each of
these classes have private member called title. Write a complete program to show
usage of dynamic method dispatch (dynamic polymorphism) to display book or paper
publications of given author.Use command line arguments for inputting data.*/
class Book
{
	private String Author_name;
	public Book(String Author_name)
	{
		this.Author_name=Author_name;
	}
	void display()
	{
		System.out.println("AUthor :  " +Author_name);
	}
}
class book_publication extends Book
{
	private String title;
	book_publication(String title)
	{
		super(" ");
		this.title=title;
	}
	void display()
	{
		System.out.println("Title1 :  " +title);
	}
}
class paper_publication extends Book
{
	private String title;
	paper_publication(String title)
	{
		super(" ");
		this.title=title;
	}
	void display()
	{
		System.out.println("Title2 :  " +title);
	}
}
class Book1
{
	public static void main(String[] args) 
	{
		Book b=new Book(args[0]);
		b.display();
		Book b1=new book_publication(args[1]);
		b1.display();
		Book b2=new paper_publication(args[2]);
		b2.display();
	}
}