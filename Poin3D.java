package lab2;
public class Point3D
{
   double x,y,z,d,e,f;
   public Point3D()
   {
   }
   public Point3D(double x)
   {
     this.x=x;
	 System.out.println("x="+x);
   }
  
   public Point3D(double y,double z)
   {
      this.y=y;
	  this.z=z;
	  System.out.println("y="+y+" z="+z);
   }
   public Point3D(double d,double e,double f)
   {
     this.d=d;
	 this.e=e;
	 this.f=f;
	 System.out.println("d="+d +" e="+e +" f="+f);
   }
 }
