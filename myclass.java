package Lab4;
public class myclass{
    public void myMethod(){
        try{
            throw new Exception("Something went Wrong!!");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
		finally{
			System.out.println("The finally block!");
		}
    }
}