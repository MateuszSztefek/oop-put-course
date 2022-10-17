public class MyClass {
    public static void main(String args[]) {
        Mouse mouse = new Mouse("Silver", false, 4);
        Keyboard keyboard = new Keyboard("Black", false);
        Display display = new Display(20, "Black", "", true);
        User user = new User("John", "Smith", 23);


        keyboard.typeText(display, "This is some text.");
        System.out.println(display.displayedText);


        user.connectKeyboard(keyboard);
        user.connectMouse(mouse);
        user.turnOffDisplay(display);
    }
}

