/*class upchar
{
	public static void main(String[] args) 
	{
		int i=0;
		while(i<args.length)
		{
			String s= args[0];
			i++;
			char c=s.charAt(0);
			if(c>='A' && c<='Z')
			{
				break;
			}
			System.out.println(s);
		}	
	}
}*/


import java.lang.*;
class upchar
{
	public static void main(String[] args) 
	{
		String	s=args[0];
		char a= s.charAt(0);
		boolean c;
		c=Character.isUpperCase(a);
		if (c)
		{
			System.out.println("upchar.java :error:cannot find data");
		}
		else
		{
			System.out.println(s);
		}
	}
}