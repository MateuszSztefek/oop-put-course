public class Main
{
    public static void main(String[] args) {
        Car car1 = new Car();
        Truck truck1 = new Truck();
        Car car2 = new Car("Mercedes", "SLA", 2015);
        Truck truck2 = new Truck("Man", "truck", 2004);
        
        Driver driver1 = new Driver("John", "Smith", 25, car2);
        Driver driver2 = new Driver("Adam", "Smith", 25, truck2);
        Driver driver3 = new Driver();
        
        System.out.println(driver1);
        car1.horn();
        truck1.horn();
        

    }
}
