package main;
import lab3.*;
import java.util.Scanner;
public class Main3
{
	public static void property()
	{
		Bungalow b=new Bungalow();
		System.out.println("Enter Details of Property Bungalow:");
		b.read();
		b.display();
		Flat f=new Flat();
		System.out.println("Enter Details of Property Flat:");
		f.read();
		f.display();
	}
	public static void multiply()
	{
		Multiplication obj=new MatrixMultiplication(3,3);
		obj.multiplication();
		obj.display();
		obj=new IntegerNumberMultiplication(8,5);
		obj.multiplication();
		obj.display();
	}
	public static void main(String a[])
	{
		int ch;
		Scanner o=new Scanner(System.in);
        System.out.println("1.Compute Price of property\n2.Implement multiplication\n");
		System.out.println("Enter your choice: ");
        ch = o.nextInt();
		switch(ch)
		{
			case 1:{
				property();
			break;
			}
			case 2:{
				multiply();
			break;
			}
			default:{
				System.out.println("\nEnter valid choice");
			break;
			}
		}
	}

}