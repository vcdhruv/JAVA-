class A
{
	int a=10;
	void display()
	{
		System.out.println("a : " +a);
	}
}
class B extends A
{	
	int b=1;
	void display()
	{
		super.display();
		System.out.println("b : " +b);
	}
}
class SuperK
{
	public static void main(String[] args) 
	{
		A a=new A();
		B b=new B();
		b.display();
	}
}