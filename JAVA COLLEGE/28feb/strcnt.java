import java.util.*;
class strcnt
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int y=0;
		int x=0;
		String s1=sc.next();
		int l=s1.length();
		String s2=s1.toLowerCase();
		for (int j=0;j<l ;j++ ) 
		{
			char ch=s2.charAt(j);
			if(ch!=' ' && ch!='.')
			{
				if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
				{
					x++;
				}
					else
				{
					y++;
				}
			}
		}
		System.out.println("NO. of Consonents is" +y);
		System.out.println("NO. of Vowels is" +x);
	}
}

 
/*
		String s1=new String();
		s1=sc.nextLine();
		String s1=s1.toLowerCase();
		for (int j=0;j<s1.length() ;j++ ) 
		{
			char ch=s1.charAt(j);
			if(ch!=' ' && ch!='.')
			{
				if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
				{
					x++;
				}
					else
				{
					y++;
				}
			}
		}
			
*/

