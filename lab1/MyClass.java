public class MyClass {
    public static void main(String args[]) {
        Mouse mouse = new Mouse();
        Keyboard keyboard = new Keyboard();
        Display display = new Display();
        
        mouse.color = "Silver";
        mouse.wireless = false;
        mouse.numberOfButtons = 4;
        
        keyboard.color = "Black";
        keyboard.wireless = false;
        
        display.size = 20;
        display.color = "Black";
        
        keyboard.typeText(display, "This is some text.");
        
        System.out.println(display.displayedText);
        
        

    }
}


