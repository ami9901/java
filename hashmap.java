package lab8;
import java.util.*;  
class hmap
{  
	public static void main(String args[]) 
	{ 
HashMap<Integer, String> map = new HashMap<Integer, String>();           
		map.put(101,"Let us C");  
		map.put(102, "Operating System");  
		map.put(103, "Data Communication and Networking");  
		System.out.println("Values before remove: \n"+ map);    
		map.remove(102);  
		System.out.println("Values after remove: \n"+ map);  
	}      
}
