package lab5;
public class Incr implements Runnable
{
	public Thread t;
	public int i=1;
	public Incr()
	{
		t=new Thread(this,"one");
		t.start();
	}
	 public void run()
	{
		while(true)
		{
			try{
				System.out.println(i++);
				Thread.sleep(1000);
			}
			catch(Exception e)
			{					
				System.out.println("caught");
			}
		}	
	}
}
