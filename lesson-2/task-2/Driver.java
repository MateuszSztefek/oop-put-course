public class Driver{
    private String name;
    private String surename;
    private Integer age;
    private Vehicle vehicle;
    
    Driver(){
        this.name = "Unknown";
        this.surename = "Unknown";
        this.age = null;
        this.vehicle = null;
    }
    Driver(String name, String surename, Integer age, Vehicle vehicle){
        this.name = name;
        this.surename = surename;
        this.age = age;
        this.vehicle = vehicle;
    }
    
    
    
    public String toString(){
        return "Name: " + name + "\nSurename: " + surename + "\nAge: " + age + "\nOwned Vehicle: " + vehicle;
    }
    
}