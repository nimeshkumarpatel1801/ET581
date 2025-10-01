public class CarWithStatic {
    static int count =0;
    int id =0;
    static{
        System.out.println("This is static block");
    }
    {
        System.out.println("This is instance block");
    }
}
