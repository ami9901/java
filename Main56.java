package main;
import lab5.*;
import java.util.Scanner;
public class Main56
{
	public static void prime() throws Exception
	{
		new Prime(100,200);
	}
	public static void incre()
	{
		try
		{
    		new Incr();
		}
		catch(Exception e)
		{
			System.out.println("caught");
		}
	}
	public static void HiLopri()
	{
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
      clicker hi=new clicker(Thread.NORM_PRIORITY +2);
      clicker lo=new clicker(Thread.NORM_PRIORITY -2);
      lo.start();
      hi.start();
      try
      {
        Thread.sleep(10000);
		}
	   catch(InterruptedException e)
	   {
	      System.out.println("Main thread interrupted.");
		}  
		lo.stop();
		hi.stop();
		try
		{
		  hi.t.join();
		  lo.t.join();
		 }
		 catch(InterruptedException e)
		 {
		    System.out.println("interruptedException caught");
		}
		System.out.println("Low-priority thread:"+lo.click);
		System.out.println("High-priority thread:"+hi.click);
	  
	  }
	public static void main(String a[]) throws Exception
	{
		int ch;
        Scanner ob=new Scanner(System.in);
        System.out.println("\n1.Find Prime\n2.Increment variable\n3.set Queue priority\n");
        System.out.println("Enter your choice: ");
        ch = ob.nextInt();
		switch(ch)
        {
        case 1:prime();
		break;
		case 2:incre();
		break;
		case 3:HiLopri();
		break;
		default:
        System.out.println("enter a valid choice");
		}
	}
}