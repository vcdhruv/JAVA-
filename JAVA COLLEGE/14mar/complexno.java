import java.util.*;
class complex
{
	int realno;
	int ig;

	void complex(int r,int i)
	{
		
		realno=r;
		ig=i;
	}
	void display()
	{
		System.out.println(realno+"+"+ig);
	}
	 void addition()
	{
		int x=realno+realno;
		int y=ig+ig;
		System.out.println(x+""+y);
	}

	public static void main(String[] args) 
	{
		complex c=new complex(2,4);
		complex v=new complex(3,7);
		complex a=new addition();
		c.display();
		v.display();
		a.addition();


	}
}

//create contructor,overload contructors,addition method to add two complex object