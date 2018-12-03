package test;
import lab3.*;
import java.util.Scanner;
public class MultiplyMain
{
	public static void main(String a[])
	{
		Multiplication obj=new MatrixMultiplication(3,3);
		obj.multiplication();
		obj.display();
		obj=new IntegerNumberMultiplication(8,5);
		obj.multiplication();
		obj.display();
	}
}