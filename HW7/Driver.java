package HW7;

public class Driver extends Car{ 
    String name;
    Vehicle vehicle;

 
    public Driver(String name, Vehicle vehicle){
        this.name = name;
        this.vehicle = vehicle;
    }
    void driver(){
       vehicle.start();
       System.out.println("Driver:"+name +"is driving" ); 
    }
} 
    

