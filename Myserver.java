package lab10;
import java.net.*;
import java.io.*;
public class Myserver
{
	public static void main(String a[])throws IOException
	{
		ServerSocket ss=new ServerSocket(3000);
		while(true)
		{
			Socket client=ss.accept();
			BufferedReader br= new BufferedReader(new InputStreamReader(client.getInputStream()));
			PrintWriter pw=new PrintWriter(client.getOutputStream(),true);
			String line=br.readLine();
			pw.println(line);
			System.out.println("Message received from client is "+line);
			client.close();
		}
	}
}