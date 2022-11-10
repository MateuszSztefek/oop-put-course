public class User {
    String firstName;
    String lastName;
    int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void disconnectKeyboard(Keyboard keyboard) {
        keyboard.isConnected = false;
    }

    public void connectKeyboard(Keyboard keyboard) {
        keyboard.isConnected = true;
    }

    public void turnOnDisplay(Display display){
        display.isON = true;
    }

    public void turnOffDisplay(Display display){
        display.isON = false;
    }

    public void disconnectMouse(Mouse mouse) {
        mouse.isConnected = false;
    }

    public void connectMouse(Mouse mouse) {
        mouse.isConnected = true;
    }

}
