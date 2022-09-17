import java.util.Scanner;
class halfstr
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int l=a.length();
		System.out.println(l);
		for (int i=(l/2);i<l ;i++ ) 
		{
			char ch=a.charAt(i);
			System.out.println(ch);
		}

	}
}