interface Transport
{
	void deliver();
}
abstract class Animal
{
	void print()
	{
		System.out.println("Transportation by Animal");
	}
}
class Tiger extends Animal implements Transport
{
	public void deliver()
	{
		System.out.println("Transport Animal : Tiger");
	}
}
class Camel extends Animal implements Transport
{
	public void deliver()
	{
		System.out.println("Transport Animal : Camel");
	}
}
class Deer extends Animal implements Transport
{
	public void deliver()
	{
		System.out.println("Transport Animal : Deer");
	}
}
class Donkey extends Animal implements Transport
{
	public void deliver()
	{
		System.out.println("Transport Animal : Donkey");
	}
}
class Main3
{
	public static void main(String[] args)
	{
		Animal[] a=new Animal[4];
		a.deliver();
	}
}