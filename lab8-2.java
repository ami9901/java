package lab8;
import java.util.Vector; 
import java.util.Enumeration; 
class Test 
{ 
    public static void main(String args[]) 
    { 
        Vector dayNames = new Vector(); 
        dayNames.add("Sunday"); 
        dayNames.add("Monday"); 
        dayNames.add("Tuesday"); 
        dayNames.add("Wednesday"); 
        dayNames.add("Thursday"); 
        dayNames.add("Friday"); 
        dayNames.add("Saturday"); 
  
        Enumeration days = dayNames.elements(); 
  
        while (days.hasMoreElements()) 
            System.out.println(days.nextElement()); 
    } 
}
