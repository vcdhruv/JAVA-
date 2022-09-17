import java.util.*;
class palinum
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int x=a;
		int d,m=0;
		while(a>0)
		{
			d=a%10;
			a=a/10;
			m=(m*10)+d;
		}
		if (x==m) 
		{
			System.out.println("Given no. is Palindrome");
		}
		else
		{
			System.out.println("Given no. is not Palindrome");
		}
	}
}