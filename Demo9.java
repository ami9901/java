package lab9;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Demo9
{
	public static void main(String a[])
	{
	FileInputStream ob=null;
	FileOutputStream obj=null;
	try{
		ob= new FileInputStream("abc.txt");
		obj=new FileOutputStream("xyz.txt");
		
		byte[] buffer=new byte[1024];
		int i;
		while((i=ob.read(buffer))!=-1)
		{
			obj.write(buffer,0,i);
			//System.out.println((char)i);
			//i=ob.read();
		}
	}
		catch(Exception e)
		{
			System.out.println("\nIOException");
		}
		finally{
		try{
		ob.close();
		obj.close();
		}
		catch(Exception e)
		{
			System.out.println("\nIOException");
		}
	}
	}
}