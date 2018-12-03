package lab5;
public class clicker implements Runnable
{
  public int click=0;
  public Thread t;
  private volatile boolean running = true;
  public clicker(int p)
  {
    t=new Thread(this);
	t.setPriority(p);
   }
   public void run()
   {
	   while(running)
       {
	   click++;
	   }
   }
   public void stop()
   {
     running=false;
   }
   public void start()
   {
     t.start();
   }
 }
