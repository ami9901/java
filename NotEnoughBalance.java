package Lab4;
public class NotEnoughBalance extends Exception{
    public NotEnoughBalance(){
        super("Enough Balance is not Available!");
    }
}