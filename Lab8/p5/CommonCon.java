package Lab8.p5;

public class CommonCon {
    public int x;
    {
        System.out.println("CommonCon instance initializer");
        x = 10;
    }

    public CommonCon() {
        System.out.println("CommonCon default constructor");
        //this.x = 10;
        //this(10);
    }
    public CommonCon(int x) {
        System.out.println("CommonCon parameterized constructor");
        this.x = x;
    }
    public static void main(String[] args) {
        CommonCon c = new CommonCon();
        System.out.println("x = " + c.x);
    }
}
