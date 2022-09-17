import java.util.Scanner;
class PalString
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Sentence : ");
		String s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Revers : "+rev);
		if(s.equals(rev))
		{
			System.out.println("pal");
		}
		else
		{
			System.out.println("Not Pal");
		}
	}
}