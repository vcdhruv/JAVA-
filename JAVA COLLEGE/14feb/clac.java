import java.io.*;
class calc
{
	public static void main(String args[])
	{
		int m=Integer.parseInt(args[0]);
		int n=Integer.parseInt(args[1]);
		int o=Integer.parseInt(args[2]);
		if (o==1) 
		{
			System.out.println(m+n);
		}
		else if (o==2) 
		{
			System.out.println(m-n);
		}
	}
}