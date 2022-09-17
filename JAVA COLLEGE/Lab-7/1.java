abstract class Vegatable
{
	String ColorOfVeg;
	Vegatable(String a)
	{
		ColorOfVeg=a;
	}
	abstract public String toString();
}
class Potato extends Vegatable
{
	Potato()
	{
		super("Yellow");
	}
	public String toString()
	{
		return "Potato "+ColorOfVeg;
	}
}
class Brinjal extends Vegatable
{
	Brinjal()
	{
		super("Violate");
	}
	public String toString()
	{
		return "Brinjal "+ColorOfVeg;
	}
}
class Tomato extends Vegatable
{
	Tomato()
	{
		super(" Red");
	}
	public String toString()
	{
		return "Tomato "+ColorOfVeg;
	}
}
class Main1
{
	public static void main(String[] args)
	{
		Vegatable s;
		s= new Potato();
		System.out.println(s);
		s= new Brinjal();
		System.out.println(s);
		s= new Tomato();
		System.out.println(s);
	}
}