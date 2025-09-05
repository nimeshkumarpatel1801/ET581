import java.util.StringTokenizer;

public class MyStringTokenizer {
    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer("apple.banana.orage mango",". ");
        System.out.println(st1.nextToken());
        System.out.println(st1.nextToken());
        System.out.println(st1.nextToken());
        System.out.println(st1.nextToken());
    }
}
