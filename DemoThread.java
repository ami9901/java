package test;
import lab5.MyThread;
class DemoThread
{
public static void main(String a[])
{
MyThread ob1=new MyThread('A',500);
ob1.start();
MyThread ob2=new MyThread('C',200);
ob2.start();
System.out.println("End of main");
}
}