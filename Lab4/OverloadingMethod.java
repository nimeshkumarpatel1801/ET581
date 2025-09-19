package Lab4;

public class OverloadingMethod {
    static int getSum(int a, int b){
        System.out.println("int getSum was called");
        return a+b;
    }
    static double getSum (double a, double b){
        System.out.println("Double getSum was called");
        return a+b;
    }
    public static void main(String[] args) {
        getSum(1,2);
        getSum(1.0,2.0);
        getSum(1,1.0);
        getSum(1.0,1);
    }
}
