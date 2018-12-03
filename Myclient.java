package lab10;
import java.net.*;
import java.io.*;
public class Myclient
{
	public static void main(String a[])throws IOException
	{
		Socket s=new Socket("127.0.0.1",3000);
		BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		String userInput;
		while ((userInput = in.readLine()) != null) {
		pw.println(userInput);
	}
		//pw.println("GCET");
		//String l=br.readLine();
		//System.out.println(l);
		s.close();
	}
}