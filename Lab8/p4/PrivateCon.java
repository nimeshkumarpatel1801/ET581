

public class PrivateCon {
    private static PrivateCon obj = new PrivateCon();
    public static int x;
    public static String y;

    private PrivateCon() {
     
    }
    public static PrivateCon getInstance(){
       // return new PrivateCon();
       return PrivateCon.obj;
    }



    public static void main(String[] args) {
        PrivateCon p = new PrivateCon();
        PrivateCon p2 = new PrivateCon();
        System.out.println(p == p2);
    }
}