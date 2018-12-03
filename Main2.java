package main;
import lab2.*;
import test.*;
import java.util.Scanner;
public class Main2
{
    public static void Overload()
    {
        OverLoadDemo D = new OverLoadDemo();
        D.test();
	    D.test(1);
	    D.test(3,4);
	    D.test(3.14);
    }
    public static void point3D()
    {
        Point3D ob =new Point3D(3.55);
        Point3D ob1= new Point3D(3.44,76.7);
        Point3D ob2= new Point3D(44.6,78.87,44.55);
    }
    public static void inherit()
    {
		N ob1=new N(6.013);
	    ob1.display();
    }
    public static void samevar()
    {
        T t=new T("hello",4);
    }
    public static void main(String a[])
    {
        int ch;
        Scanner ob=new Scanner(System.in);
        System.out.println("\n1.Overloading Demo with different data types\n2.Overloading Demo with different number of arguments\n3.Inheritance Demo\n4.Inheriting same variable\n");
        System.out.println("Enter your choice: ");
        ch = ob.nextInt();
        switch(ch)
        {
        case 1:Overload();
        break;
        case 2:point3D();
        break;
        case 3:inherit();
        break;
        case 4:samevar();
        break;
        default:
        System.out.println("enter a valid choice");
        }
    }
}

    
