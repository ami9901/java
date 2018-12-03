package lab5;
public class MyThread extends Thread
{
	int delay;
	char letter;
	public MyThread(char ch,int del)
	{
		letter=ch;
		delay=del;
	}
	public void run()
	{
		try
		{
			while(true)
			{
				System.out.println(letter);
				Thread.sleep(delay);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Error!");
		}
	}
}
