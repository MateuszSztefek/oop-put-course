public class MyClass {
    
    
    
    public static void main(String args[]) {
        Display[] display = new Display[4];
        display[0] = new Display(18.49, "White");
        display[1] = new Display(20, "Dell", "Black");
        display[2] = new Display(14.8, "Dell", "Black");
        display[3] = new Display(21, "Red");
        
        
        for (Display dis : display){
            System.out.println(dis.size + " " + dis.name + " " + dis.color);
        }
        
    }
}