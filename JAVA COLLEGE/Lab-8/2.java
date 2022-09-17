import java.io.*;
class Main2
{
	public static void main(String[] args)
	{
		int s=0;
		for (int i=0;i<args.length;i++) 
		{
			try
			{
				int a=Integer.parseInt(args[0]);
				int flag=0;
				if (a<0) 
				{
					flag=1;
				}
				if (a%10==0)
				{
					flag=1;
				}
				if (a>1000 && a<2000)
				{
					flag=1;
				}
				if (a>7000)
				{
					flag=1;
				}
				if (flag==1)
				{
					throw new Exception("Error Occupied");
				}
				else
				{
					s=s+a;
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Anwer : " +s);
	}
}