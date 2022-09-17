class Account
{
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int c=Integer.parseInt(args[1]);
		int x=5000000;
		int s=0;
		try
		{
			switch(c)
			{
				case 1:
					if (a<0)
					{
						throw new Exception("Insufficient Fund");
					}
					else
					{
						s=x-a;
						System.out.println(s);
					}
				break;

				case 2:
					s=x+a;
					System.out.println(s);
				break;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}