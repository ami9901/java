package main;
import Lab4.*;
import java.util.Scanner;
public class Main4 {
    public static void check(int total,int correct) throws ArithmeticException{
        if(correct/total == 1);
        double res= ((float) correct)/total;
        if(res>0.40)
            System.out.println("Pass!");
        else
            System.out.println("Failed!");
    }
	    public static void exp3(String args[]){
        double d1,d2;
        try{
            d1=Double.parseDouble(args[0]);
            d2=Double.parseDouble(args[1]);
            if(d2==0.0)
				throw new ArithmeticException();
            double res=d1/d2;
			System.out.println("Result : "+res);
        }
        catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Please enter the valid args!");
            System.out.println(e);
        }
        catch (ArithmeticException e){
			System.out.println("Second argument cannot be zero!");
            System.out.println(e);
        }
		catch (NumberFormatException e){
			System.out.println("Only Numerical values are allowed !");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch=1;
		while(ch>0){
		System.out.println("Enter the practical Number(0 for exit) : ");
		ch=sc.nextInt();
		switch(ch){
			case 1:
			try{
			check(0,5);
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			}
			try{
				check(10,6);
			}
			catch (ArithmeticException e){
				System.out.println(e);
			}
			break;
		case 2:
		myclass obj=new myclass();
        obj.myMethod();
		break;
		
		case 3:
		exp3(args);
		break;
		
		case 4:
		stack mystack=new stack(4);
		int stkch=0;
		while(stkch!=3){
			System.out.println("1.push\n2.pop\n3.Exit");
			stkch=sc.nextInt();
			switch(stkch){
				case 1:
				System.out.println("Enter the number : ");
				mystack.push(sc.nextInt());
				break;
				case 2:
				System.out.println(mystack.pop());
				break;
			}
		}
		
		break;
		case 5:
		Bank bobj = new Bank();
		int bch=0;
		while(bch!=4){
			System.out.println("1.Deposit\n2.Withdraw\n3.Display\n4.Exit");
			bch=sc.nextInt();
			switch(bch){
				case 1:
				System.out.println("Enter the amount : ");
				bobj.deposit(sc.nextDouble());
				break;
				case 2:
				try{
				bobj.withdraw(sc.nextDouble());
				}
				catch(ArithmeticException e){
					System.out.println("Balance cannot be less than 500");
					System.out.println(e);
				}
				catch(NotEnoughBalance e){
					System.out.println(e.getMessage());
				}
				case 3:
				bobj.display();
				break;
				
			}
		}
		
    }
		
	
	}
	}
}
