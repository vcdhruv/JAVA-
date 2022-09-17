import java.util.*;
class prime
{
	public static void main(String[] args) 
	{
		Scanner it=new Scanner(System.in);
		int x=it.nextInt();		
		boolean flag=true;
		for (int i=2;i<x;i++) 
		{
			if (x%i==0) 
			{
				flag=false;
			}
		}
		if (flag==true) 
		{
			System.out.println(x +" is Prime no.");
		}
		else
		{
			System.out.println(x +" is not Prime no.");
		}
	}
}
