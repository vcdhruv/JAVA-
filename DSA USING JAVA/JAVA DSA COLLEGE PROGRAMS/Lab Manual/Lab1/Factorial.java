import java.util.Scanner;

class Factorial
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to find its Factorial:");
		int n=s.nextInt();
		int factorial=1;
		for(int i=1;i<=n;i++)
		{
			factorial*=i;
		}	
		System.out.println("The factorial of "+n+" is "+factorial);
	}
}