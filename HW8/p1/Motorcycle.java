package HW8.p1;

public class Motorcycle extends Vehicle {
    boolean hasSidecar;
    public Motorcycle(String brand,String model, int year,boolean hasSidecar){
        super(brand,model,year);
        this.hasSidecar = hasSidecar;
    }
    public void drive(){
        System.out.println("Motorcycle is speeding on the highway.");
    }
    public  void stop(){
        System.out.println("Motorcycle stopped safely.");
    }
}
