public class TwoNumbers {
    private int a, b;
    
    TwoNumbers(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int max(){
        return a > b ? a : b;
    }
    
    public int min(){
        return a < b ? a : b;
    }
    
    public float avg(){
        return (a + b) / 2;
    }
}