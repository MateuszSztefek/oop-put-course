public class Car implements Vehicle{
    private String company;
    private String model;
    private Integer productionYear;
    
    Car(String company, String model, Integer productionYear){
        this.company = company;
        this.model = model;
        this.productionYear = productionYear;
    }
    Car(){
        this.company = "unknownCar";
        this.model = "unknownCar";
        this.productionYear = null;
    }
    
    
    
    public void horn(){
        System.out.println("Beeep!");
    }
    
    public void turnOnEngine(){
        System.out.println("Starting engine!");
    }
    
    public void turnOffEngine(){
        System.out.println("The engine has been turned off!");
    }
    
    
    public String toString(){
        return "{Company: " + company + ", Model: " + model + ", Production year: " + productionYear + "}";
    }
}