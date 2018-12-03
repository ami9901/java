package lab7;
public class factorial
{
	int n;
	public int fact(int n)
	{
		if(n<=1)
			return 1;	
		else
		{
			return (n*fact(n-1));
		}
	}
}