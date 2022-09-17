import java.util.*;
class quit
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x=0;
		String s1=sc.next();
		int l=s1.length();
		for (int j=0;j<l ;j++ ) 
		{
			char ch=s1.charAt(j);
			if (ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') 
			{
				x++;
			}
			else if (s1=="quit" || s1=="QUIT") 
			{
				break;
			}
		}
		System.out.println("NO. of Vowels is" +x);
	}
}