import java.util.*;
class calc2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);	
		int a=sc.nextInt();
		int b=sc.nextInt();
		String x=sc.next();
		char c=x.charAt(0);
		switch (c) 
		{
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			case '*':
				System.out.println(a*b);
				break;
		/*	case '/':
				if (b!=0)
				{
					System.out.println(a/b);
				}
				else
				{
					System.out.println("Please enter No. which has no zero[0] value");
				}
				break;
		*/	
			case '/':
				try
				{
					if(b!=0)
					{
						System.out.println(a/b);
					}
					else
					{
						throw new Exception ("AerithmeticException");
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			
			default:
				System.out.println("Invalid choice");
				break;
		}
	}
}