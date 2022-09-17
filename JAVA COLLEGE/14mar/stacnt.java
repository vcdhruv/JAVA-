import java.util.*;
class Statickey
{
	int n=0;
	Statickey()
	{
		n++;
		System.out.println("no. of n " +n);
	}
	public static void main(String[] args)
	{
		Statickey s1=new Statickey();
	}
	
}