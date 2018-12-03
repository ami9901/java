import java.util.*;
import java.io.*;
import java.net.*;
public class Client
{
	public static void main(String args[])throws IOException
	{
		Socket client=new Socket("localhost",3333);
		OutputStream s1Out=client.getOutputStream();
		InputStream s1In=client.getInputStream();
		DataOutputStream dos=new DataOutputStream(s1Out);
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		dos.writeUTF(str);
		DataInputStream dis=new DataInputStream(s1In);
		String st=new String (dis.readUTF());
		System.out.println(st);
		dos.close();
		s1Out.close();
		dis.close();
		s1In.close();
		client.close();
	}
}
