package HW8.p1;

public class VehicleTest {
     public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Toyota", "Camry", 2023, 4);
        vehicles[1] = new Motorcycle("Honda", "CBR500", 2024, false);

        System.out.println("=== Vehicle Test ===");
        for (Vehicle v : vehicles) {
            v.start();
            v.drive();
            v.stop();
            System.out.println();
        }
    }
}
