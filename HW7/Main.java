package HW7;

public class Main {
    public static void main(String[] args) {
 Vehicle v = new Vehicle("Generic Vehicle", 2020);
 Car c = new Car("Toyota", 2023, 4);
 Driver d1 = new Driver("Alice", v);
 Driver d2 = new Driver("Bob", c);
 v.start(); // Vehicle starts
 c.start(); // Car starts
 d1.driver(); // Driver Alice is driving
 d2.driver(); //Driver Bob is driving
    }
}