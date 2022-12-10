public class Main
{
    public static void main(String[] args) {
        Logarithm log = new Logarithm(-2, 8);
        
        try{
            System.out.println(log.doubleValue());
        }catch(Exception e){
            System.out.println("You can't calculate logarithm with given numbers!");
        }
        
    }
}
