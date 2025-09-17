package Lab4;
import java.lang.Math;

public class RandomNumber {
    public static void main(String[] args) {
        double rDouble = Math.random();
        System.out.println(rDouble);
        int rInt = (int)(Math.random()*100);
        System.out.println(rInt);
        int intTo100 =(int)(Math.random()*10);
        System.out.println(intTo100);
    }    
}
