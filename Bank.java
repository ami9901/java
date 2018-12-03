package Lab4;
public class Bank{
    private double amount;
    public Bank(){
        amount=500.0;
    }
    public void deposit(double add){
        display();
        amount=amount+add;
		System.out.println("Amount added successfully!");
		display();
		
    }
    public void withdraw(double sub) throws NotEnoughBalance,ArithmeticException{
        if(amount-sub<0)
            throw new NotEnoughBalance();
        else if (amount-sub<500)
            throw new ArithmeticException();
        else{
            amount=amount-sub;
            System.out.println("Withdrawal successful !");
            
        }

    }
	public void display(){
		System.out.println("amount : "+amount);
	}
}