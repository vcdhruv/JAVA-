class Odd implements Runnable
{
	Odd()
	{
		new Thread(this,"Odd").start();
	}
	public void run()
	{
		String s=Thread.currentThread().getName();
		for (int i=1;i<=20 ;i++ ) 
		{
			try
			{
				if (i%2==1) 
				{
					System.out.println("Odd Number :"+i);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
class Even implements Runnable
{
	Even()
	{
		new Thread(this,"Even").start();
	}
	public void run()
	{
		String s=Thread.currentThread().getName();
		for (int i=1;i<=20 ;i++ ) 
		{
			try
			{
				if (i%2==0) 
				{
					System.out.println("Even Number :"+i);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
class Main2
{
	public static void main(String[] args)
	{
		Even a=new Even();
		Odd b=new Odd();
	}
}