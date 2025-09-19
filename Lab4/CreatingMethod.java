package Lab4;
import java.lang.Math;

public class CreatingMethod {
     static int intMethod(){
        System.out.println("We are inside of intMethod");
        return (int) (Math.random()*101);
    }
    static void voidMathod(String name){
        System.out.println(name);
        if (name.equals("nimesh"))return;
        System.out.println("this is extra");
    }
    public static void main(String[] args) {
       int returnvalue= intMethod();
       System.out.println(returnvalue);
       voidMathod("nimesh");

    }
}
