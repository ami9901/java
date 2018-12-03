package lab3;
public class IntegerNumberMultiplication implements Multiplication
{
	int a,b,ans;
	public IntegerNumberMultiplication(){}
	public IntegerNumberMultiplication(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void multiplication()
	{
		ans=a*b;
	}
	public void display()
	{
		System.out.println("Answer:"+ans);
	}
}
