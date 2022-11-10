public class Display{
    int size;
    String name;
    String color;
    
    Display(int size, String name, String color){
        this.size = size;
        this.name = name;
        this.color = color;
    }
    
    Display(double size, String name, String color){
        this((int) size, name, color);
    }
    
    Display(int size, String color){
        this(size, "Noname", color);
    }
    
    Display(double size, String color){
        this((int)size, "Noname", color);
    }
    

}