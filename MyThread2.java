package lab5;
public class MyThread2 extends Thread
{
	counter c;
	int ch;
	public MyThread2(int ch,counter c)
	{
		this.ch=ch;
		this.c=c;
	}
	public void run()
	{
		while(true)
		{
		try
		{
			if(ch==1)
			{
			c.incr();
			Thread.sleep(100);
			}
			else{
			c.decr();
			Thread.sleep(100);
			}
		}
		catch(Exception e)
		{
		System.out.println("Exception occured!");
		}
		}
	}
}