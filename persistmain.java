package test;
import lab9.*;
import java.io.*;
public class persistmain
{
	public static void main(String a[])
	{
		Student s=new Student(31,"Amisha");
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		try
		{
			fout=new FileOutputStream("f.txt");
			out=new ObjectOutputStream(fout);
			out.writeobject;
			System.out.println("Success");
		}
		catch(Exception e)
		{
			System.out.println("Error!");
		}
		finally
		{
			try
			{
				fout.close();
				out.flush();
			}
			catch(Exception x)
			{
				System.out.println("Error!");
			}
		}
	}
}