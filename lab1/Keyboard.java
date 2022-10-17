public class Keyboard{
    String color;
    Boolean isConnected;

    public Keyboard(String color, Boolean isConnected) {
        this.color = color;
        this.isConnected = isConnected;
    }

    public void typeText(Display display, String text){
        display.displayedText += text;

    }

}
