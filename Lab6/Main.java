public class Main {
    public static void main(String[] args) {
    //     Car car1 = new Car();
       
    //    car1.drive();
    //    car1.color="red";
    //    car1.year=2020;
    //    car1.drive();

    //     Car car2 = new Car("blue");
    //     car2.drive();
         
    //     Car car3 = new Car("black",2018);
    //     car3.drive();

    //     Car car4 = new Car(2015);
    //     car4.drive();

        CarWithStatic cas1 = new CarWithStatic();

        CarWithStatic cas2 = new CarWithStatic();
        CarWithStatic cas3 = new CarWithStatic();
        System.out.println(CarWithStatic.count);
        System.out.println(cas1.id);
    }
}
