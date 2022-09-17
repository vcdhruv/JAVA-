interface A
{
	int a=1;
	void print1();
}
interface A1 extends A
{
	int b=5;
	void print2();
}
interface A2 extends A
{
	int c=6;
	void print3();
}
interface P1
{
	int x=10;
	void print4();
}
interface P2
{
	int y=20;
	void print5();
}
interface A12 extends P1,P2,A1,A2
{
	int z=15;	
	void print6();
}
class B implements A12
{
	public void print1()
	{
		System.out.println("value of a : "+a);
	}
	public void print2()
	{
		System.out.println("value of b : "+b);
	}
	public void print3()
	{
		System.out.println("value of c : "+c);
	}
	public void print4()
	{
		System.out.println("value of x : "+x);
	}
	public void print5()
	{
		System.out.println("value of y : "+y);
	}
	public void print6()
	{
		System.out.println("value of z : "+z);
	}
}
class Demo
{
	public static void main(String[] args)
	{
		B s=new B();
		s.print1();
		s.print2();
		s.print3();
		s.print4();
		s.print5();
		s.print6();
	}
}