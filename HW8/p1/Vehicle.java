package HW8.p1;

public abstract class Vehicle {
    String brand;
    String model;
    int year;

    public Vehicle(String brand, String model,int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public void start(){
        System.out.println("Vehiclde is starting...");
    }
    abstract void drive();
    abstract void stop();
}
