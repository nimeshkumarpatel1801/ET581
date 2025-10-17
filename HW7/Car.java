package HW7;

public class Car extends Vehicle {
  
    int doors;
    public Car(String brand, int year,int doors){
      super(brand, year);
        this.doors = doors;
        System.out.println("Car is :"+brand + "year is :"+year + "doors are :"+doors);
    }
   
   
    void start(){
        System.out.println("Car starts");
    }

    //void displayInfo(){
    //    System.out.println("Brand: " + brand + ", Year: " + year + ", Doors: " + doors);
   // }
    
}  
    
