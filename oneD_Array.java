import java.util.Scanner;
class Array
{
private int arr[];
Array()
{
	arr=new int[5];
}
Array(int b[])
{
	arr=b;
}
void read()
{
	Scanner ob=new Scanner(System.in);
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=ob.nextInt();
	}
}
void display()
{
	System.out.println("\nThe array elements are:");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+"\t");
	}
}
int[] getdata()
{
	return arr;
}
Array addition(Array x)
{
	int c[]=x.getdata();
	Array temp=new Array();
	for(int i=0;i<c.length;i++)
	{
		temp.arr[i]=arr[i]+c[i];	
	}
	return temp;
}
}
