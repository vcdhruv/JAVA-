class Areacir
{
	double area(double r)
	{
		double x=r*r*3.14;
		return x;
	}
	public static void main(String[] args)
	{
		double r= Double.parseDouble(args[0]);
		Areacir sc=new Areacir();
		double a=sc.area(r);
		System.out.println(a);

	}
}