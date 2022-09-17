class Runnable1 implements Runnable
{
	Runnable1()
	{
		new Thread (this,"First").start();
	}
	public void run()
	{
		for(;;)
		{
			String s=Thread.currentThread().getName();
			System.out.println(s+ " : Good Morning");
			try
			{
				Thread.currentThread().sleep(1000);
			}
			catch(Exception e){}
		}
	}
}
class Runnable2 implements Runnable
{
	Runnable2()
	{
		new Thread (this,"Second").start();
	}
	public void run()
	{
		for( ;;)
		{
			String s=Thread.currentThread().getName();
			System.out.println(s+ " : Good Morning");
			try
			{
				Thread.currentThread().sleep(3000);
			}
			catch(Exception e){}
		}
	}
}
class Main1
{
	public static void main(String[] args)
	{
		Runnable1 a=new Runnable1();
		Runnable2 b=new Runnable2();
	}
}
