import java.util.*;
class max
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if (a>b && a>c) 
		{
			System.out.println(a +" is Lasgest");
		}
		else if (b>a && b>c) 
		{
			System.out.println(b +" is Largest");
		}
		else
		{
			System.out.println(c +" is Largest");
		}

		
		int r=(a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println(r);
	}
}