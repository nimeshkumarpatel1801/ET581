public class Car {
    String color;
    int year;
    Car(){//constructor
        System.out.println("default constructor is called");
        this.color="default";
        this.year=2023;
    }
    Car(String color){
        System.out.println("one string constructor is called");
        this.color = color;
    }
    Car(String color, int year){
        System.out.println("two parameter constructor is called");
        this.color=color;
        this.year=year;
    }
    Car(int y){
        System.out.println("one integer constructor is called");
        year=y;
    }
    void drive(){
        System.out.println("The"+this.color + this.year+"is driving");
    }
}
