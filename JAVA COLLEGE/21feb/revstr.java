import java.util.*;
class revstr
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String t=sc.next();
		String r;
		int l=t.length();
		for (int i=l-1;i>=0 ;i-- ) 
		{
			char c=t.charAt(i);
			System.out.print(c+" ");
		}
		/*if (t==c) 
		{
			System.out.println("Given String is Palindrome String");
		}
		else
		{
			System.out.println("Giiven String is not palindrome String");
		}*/
	}
}


import java.util.*;
public class CharToStringExample1
{  
	public static void main(String args[])
	{ 
		Scanner sc=new Scanner(System.in);
		String t=sc.next();
		int l=t.length();
		for (int i=l-1;i>=0 ;i-- ) 
		{
			char c=t.charAt(i);
		}  
		String r=String.valueOf(c);  
		System.out.println("String is: "+r);  
	}
}
