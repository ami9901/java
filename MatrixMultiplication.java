package lab3;
import java.util.Scanner;
public class MatrixMultiplication implements Multiplication
{	
	int data[][];
	int temp[][];
	public MatrixMultiplication(int row,int col)
	{
		data=new int [row][col];
		read();
	}
	public void read()
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter elements of array:\n");
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[0].length;j++)
			{
				data[i][j]=ob.nextInt();
			}
			System.out.print("\n");
		}
	}
	public void display()
	{
		for(int i=0;i<temp.length;i++)
		{
			for(int j=0;j<temp[0].length;j++)
			{
				System.out.print(temp[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
	public void multiplication()
	{
		MatrixMultiplication two=new MatrixMultiplication(data.length,data[0].length);
		temp=new int[data.length][two.data[0].length];
		int sum=0;
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<two.data[0].length;j++)
			{
				for(int k=0;k<two.data.length;k++)
				{
					sum+=this.data[i][k]*two.data[k][j];
				}
				temp[i][j]=sum;
				sum=0;
			}
		}
	}
}
