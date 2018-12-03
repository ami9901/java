package lab8;
import java.util.*; 
class Student
{  
	int rollno;  
	String name;  
	int age;  
	
	Student(int rollno,String name,int age)
	{  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age; 
	}
 }

class TestStudent
{  
	public static void main(String args[])
	{  
  
		Student s1=new Student(10,"mansi",24);  
		Student s2=new Student(05,"jeel",20);  
		Student s3=new Student(15,"divya",23);  
		Student s4=new Student(07,"jil",19);  
		Student s5=new Student(13,"Tulsi",15);  
		Student s6=new Student(04,"vaibhavi",20);  
  
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(s1);
		al.add(s2);  
		al.add(s3);  
		al.add(s4); 
		al.add(s5); 
		al.add(s6); 
  
		for(Student st:al) 
System.out.println(st.rollno+" "+st.name+" " + st.age);   
	}   
 }
