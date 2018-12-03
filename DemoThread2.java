package test;
import lab5.*;
class DemoThread2
{
	public static void main(String a[])
	{
		counter c=new counter();
		MyThread2 ob1=new MyThread2(1,c);
		ob1.start();
		//MyThread2 ob2=new MyThread2(0,c);
		
		//ob2.start();
	}
}