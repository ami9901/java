package lab8;
import java.util.*;
class Book
{
	int id;
	String name,author,publisher;
	int quantity;
	
     public Book(int id,String name,String author,
                 String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}

class htable
{
	public static void main(String a[])
	{
		Map<Integer,Book> map=new Hashtable<Integer,Book>();
          Book b1=new Book(101,"Let us C","Yashwant      Kanethar","BPB",8);
          Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
          Book b3=new Book(103,"Operating System", "Galvin","Wiley",6);
		map.put(1,b1);
		map.put(2,b2);
		map.put(3,b3);
		for(Map.Entry<Integer,Book> entry:map.entrySet())
		{
			int key=entry.getKey();
			Book b=entry.getValue();
			System.out.println("\n"+key+" Details :");
			System.out.println("Id :"+b.id);
			System.out.println("\nBook name :"+b.name);
			System.out.println("\nAuthor name :"+b.author);
               System.out.println("\nPublisher :"+ b.publisher);
			System.out.println("\nQuantity :"+b.quantity);	
			}
	}
}
