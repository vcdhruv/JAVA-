import java.util.*;
class Mark
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=sc.nextFloat();
		float d=sc.nextFloat();
		float e=sc.nextFloat();
		float s=(a+b+c+d+e)/5;
		System.out.println(s);
		if (s>=60) 
		{
			System.out.println("First class");
		}
		else if (s>=50) 
		{
			System.out.println("Second class");
		}
		else if (s>=40) 
		{
			System.out.println("Third class");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}