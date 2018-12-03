package lab1; 
import java.util.Scanner;
public class Array
{
private int arr[];
public Array()
{
	arr=new int[5];
}
public Array(int i)
{
	arr=new int[i];
}
public Array(int b[])
{
	arr=b;
}
public void read()
{
	Scanner ob=new Scanner(System.in);
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=ob.nextInt();
	}
}
public int[] getdata()
{
	return arr;
}
public void display()
{
	System.out.println("\nThe array elements are:");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+"\t");
	}
}
public Array merging(Array x)
{	
	int i;
	int j;
	int c[]=x.getdata();
	Array result=new Array(c.length+c.length);
	for(i=0;i<arr.length;i++)
	{
		result.arr[i]=arr[i];
		//System.out.println(result.arr[i]);
	}
	for(j=0;j<c.length;j++)
	{
	//System.out.println("Hii");
		//System.out.println("c[j] :" + c[j]);
		result.arr[i++]=c[j];
		//System.out.println(i);
	}
	return result;
}
public void sort(Array a3)
{
	int temp;
	for(int i=0;i<a3.arr.length;i++)
	{
		for(int j=i;j<a3.arr.length;j++)
		{
			if(a3.arr[j]<a3.arr[i])
			{
				temp=a3.arr[i];
				a3.arr[i]=a3.arr[j];
				a3.arr[j]=temp;
			}
		}
	}
}
}

