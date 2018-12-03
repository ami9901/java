package test;
import lab7.*;
public class factmain
{
	public static void main(String a[])
	{
		int x=Integer.parseInt(a[0]);
		int ans;
		factorial d1;
		d1=new factorial();
		ans=d1.fact(x);
		System.out.println("factorial of "+x+" is " + ans);
	}
}