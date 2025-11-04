package HW8.p1;

public class Car extends Vehicle {
    int numberOfDoors;
    public Car(String brand, String model, int year, int numberOfDoors){
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }
    public void drive(){
        System.out.println("Car is driving smoothly.");
    }
    public void stop(){
        System.out.println("Car stopped at the traffic light.");
    }
    
}
