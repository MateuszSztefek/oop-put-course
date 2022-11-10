public class Truck implements Vehicle{
    private String company;
    private String model;
    private Integer productionYear;
    
    Truck(String company, String model, Integer productionYear){
        this.company = company;
        this.model = model;
        this.productionYear = productionYear;
    }
    Truck(){
        this.company = "unknownTruck";
        this.model = "unknownTruck";
        this.productionYear = null;
    }
    

    public void horn(){
        System.out.println("Truck beeep!");
    }
    
    public void turnOnEngine(){
        System.out.println("Starting truck engine!");
    }
    
    public void turnOffEngine(){
        System.out.println("The truck engine has been turned off!");
    }
    
    
    
    public String toString(){
        return "{Company: " + company + ", Model: " + model + ", Production year: " + productionYear + "}";
    }
}