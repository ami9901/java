package main;
import lab1.*;
import test.*;
import java.util.Scanner;
public class Main1
{
public static void merge()
{
    int x[]={5,8,3,7,1};
	Array a1=new Array();
	Array a2=new Array(x);
	Array a3;
	a1.read();
	a3=a1.merging(a2);
	a1.display();
	a2.display();
	System.out.println("The merged array is:");
	a3.display();
	System.out.println("The sorted array is:");
	a3.sort(a3);
	a3.display();
}
public static void matrix()
{
    int d[][]={{1,2,3},{4,5,6},{7,8,9}};
    Matrix m1=new Matrix(3,3);
	Matrix m2=new Matrix(d);
	Matrix m3;
	Matrix m4;
	m1.read();
	m3=m1.add(m2);
	m4=m1.multiply(m2);
	m1.display();
	m2.display();
	m3.display();
	m4.display();
}
public static void main(String a[])
{
int ca;	
Scanner sc=new Scanner(System.in);
System.out.println("\n1.Reverse a number\n2.cmd line calc\n3.Fibonacci series\n4.Merge 2 Arrays in 3rd and also sort\n5.To add and multiply two int matries");
System.out.println("Enter your choice: ");
ca= sc.nextInt();
switch(ca)
{
case 1:
{
    int ans;
	reverse d1=new reverse();
    Scanner sca=new Scanner(System.in);
    int x= sca.nextInt();
	ans=d1.rev(x);
	System.out.println("Reverse of"+x+" is "+ans);
    break;
}
case 2:
{
int x = Integer.parseInt(a[0]);
int y = Integer.parseInt(a[2]);
char c = a[1].charAt(0);
Cal ob2 = new Cal(x,y,c);
ob2.run();
break;
}
case 3:
{
Fib ob3 = new Fib();
ob3.run();
break;
}
case 4:
merge();
break;
case 5:
matrix();
break;
default:
System.out.println("enter a valid choice");
}
}
}

