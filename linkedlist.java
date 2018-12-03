package lab8;
import java.util.*;
class TestList
{
	public static void main(String a[])
	{
		LinkedList<String> a1=new LinkedList<String>();
		a1.add("Mansi");
		a1.add("Mahima");
		a1.add("Mahi");
		a1.add("Rainal");
		a1.add("Shivani");
		a1.add("Shiv");
		a1.add("Adi");
		
		Iterator<String>itr=a1.iterator();
		{
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
	}
}
