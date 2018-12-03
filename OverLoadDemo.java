package lab2;
public class OverLoadDemo
{
   int x,y,z;
   double e;
   public void test()
   {
   x=10;
   System.out.println(x);
   }
   public void test(int a)
   {
     x=a;
	 System.out.println(x);
   }
   public void test(int b,int c)
   {
     y=b;
	 z=c;
	 System.out.println(y);
     System.out.println(z);	 
	}
    public void test(double d)  
	{
	   e=d;
	   System.out.println(e);
	}
}
