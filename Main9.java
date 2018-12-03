package main;
import lab9.*;
import java.io.*;
import java.util.Scanner;
public class Main9
{
	public static void filecopy()
	{
		FileInputStream ob=null;
		FileOutputStream obx=null;
		try
		{
			ob= new FileInputStream("abc.txt");
			obx=new FileOutputStream("xyz.txt");
			
			byte[] buffer=new byte[1024];
			int i;
			while((i=ob.read(buffer))!=-1)
			{
				obx.write(buffer,0,i);
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
				obx.close();
				}
				catch(Exception e)
				{
					System.out.println("\nIOException");
				}
		}
	}
	public static void mergefiles()
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
	public static void Studentmain()
	{
		Stu S1 = new Stu();
		   FileOutputStream fout=null;
		   ObjectOutputStream out=null;
		   S1.setEn_no(123);
		   S1.setName("neha");
		   System.out.println(S1.en_no+" "+S1.name);
		  try
		  {
		  fout=new FileOutputStream("student.txt");
		  out=new ObjectOutputStream(fout);
		  out.writeObject(S1.toString());
		  System.out.print("objects successfully written");
		  }
		  catch(Exception e)
		  {
		     System.out.print(e);
		  }
		  finally 
		  {
		  try
		  {
		     fout.close();
		    }
		   catch(Exception e)
		   {
		    System.out.println("exception occured");
	       }
		  }
	}
	public static void main(String a[])
	{
		int ch;
		Scanner o=new Scanner(System.in);
        System.out.println("1.Copy Content from one file to other\n2.Merge two files\n3. Write student details in file\n");
		System.out.println("Enter your choice: ");
        ch = o.nextInt();
		switch(ch)
		{
			case 1:{
				filecopy();
			break;
			}
			case 2:{
				mergefiles();
			break;
			}
			case 3:{
				Studentmain();
			break;
			}
			default:{
				System.out.println("\nEnter valid choice");
			break;
			}
		}
	}	
}