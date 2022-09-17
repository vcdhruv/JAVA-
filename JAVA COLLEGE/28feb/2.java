import java.util.*;
class fourarray
{
	public static void main(String[] args)
	{
						//int[] a=new int[]{1,2,3,4};
		int[] a=new int[4];
		float avg,sum=0;
		for(int i=0;i<a.length;i++)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter "+(i+1) +" element");
						a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Element : " +a[i]);
		}
		for (int i=0 ;i<a.length ;i++ )
		{
			sum=sum+a[i];	
		}
		avg=(float)sum/a.length;
		System.out.println(avg);
	}
}