class MethOverLoad
{
	void sum(int a,int b)
	{
		int add=a+b;
		
	}
	void sum(double a,double b)
	{
		double add=a+b;
		
	}
	public static void main(String[] args) 
	{
		MethOverLoad o=new MethOverLoad();
		int a=o.sum(5,6);
		System.out.println(a);
	}
}