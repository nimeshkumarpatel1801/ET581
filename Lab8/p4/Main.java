public class Main {
    public static void main(String[] args) {
       PrivateCon p = PrivateCon.getInstance();
        PrivateCon p2 = PrivateCon.getInstance();
        System.out.println(p == p2);
    }
}
