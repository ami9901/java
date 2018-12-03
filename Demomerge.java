package lab9;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Demomerge
{
	public static void main(String a[])
	{
	FileInputStream ob1=null;
	FileInputStream ob2=null;
	FileOutputStream obj=null;
	try{
		ob1= new FileInputStream("abc.txt");
		ob2= new FileInputStream("xyz.txt");
		obj=new FileOutputStream("final.txt");
		
		byte[] buffer=new byte[1024];
		int i;
		while((i=ob1.read(buffer))!=-1)
		{
			obj.write(buffer,0,i);
		}
		while((i=ob2.read(buffer))!=-1)
		{
			obj.write(buffer,0,i);
		}
	}
		catch(Exception e)
		{
			System.out.println("\nIOException");
		}
		finally{
		try{
		ob1.close();
		ob2.close();
		obj.close();
		}
		catch(Exception e)
		{
			System.out.println("\nIOException");
		}
	}
	}
}