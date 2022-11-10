public class Display{
    int size;
    String color;
    String displayedText = "";
    Boolean isON;

    public Display(int size, String color, String displayedText, Boolean isON) {
        this.size = size;
        this.color = color;
        this.displayedText = displayedText;
        this.isON = isON;
    }
}