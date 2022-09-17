final class A
{
	int b;
	public A(int b);
	{
		this.b=b;
	}

}
class B extends A
{
	int c;
	public B(int c)
	{
		super(int b);
		this.c=c;

	}
	void display()
	{
		System.out.println(super.b+" "+c);
	}
}
class FinalK
{
	public static void main(String args [])
	{
		A a=new A(5);
		B b=new B(5);
		b.display();

	}
}