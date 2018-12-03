package lab1;
class Democalc
{
public static void main(String a[])
{
int res=0;
int x=Integer.parseInt(a[0]);
int y=Integer.parseInt(a[2]);
char ch=a[1].charAt(1);
switch(ch)
{
case '+':
	{
	res=x+y;
	System.out.println(x+"+"+y+"="+res);
	break;
	}
case '-':
	{
	res=x-y;
	System.out.println(x+"-"+y+"="+res);
		break;
	}
case '*':
	{
	res=x*y;
	System.out.println(x+"*"+y+"="+res);
		break;
	}	
case '/':
	{
	res=x/y;
	System.out.println(x+"/"+y+"="+res);
		break;
	}	
default:
		System.out.println("\nEnter valid statement");
}
}
}
