import java.io.*;
class Main
{
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		try
		{
			int x=a*b; 
			System.out.println("Answer : " +x);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}