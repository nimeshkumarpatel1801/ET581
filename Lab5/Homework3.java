package Lab5;

public class Homework3 {
    //metho to return absolute difference between two integers
    static int absoluteDifference(int a, int b){
        return Math.abs(a - b);
    }
    public static void main(String[] args) {
        System.out.println(absoluteDifference(10, 20)); //should print 10
        System.out.println(absoluteDifference(20, 10)); //should print 10
        System.out.println(absoluteDifference(-10, 10)); //should print 20  
    }
}
