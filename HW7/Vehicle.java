package HW7;

public class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year){
        
    }
    public void vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
        System.out.println("Vehicle is :"+brand + "year is :"+year);
    }

    void start(){
        System.out.println("Vehicle starts");
    }
    final void displayInfo(){
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
