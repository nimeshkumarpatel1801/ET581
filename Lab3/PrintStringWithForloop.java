package Lab3;

public class PrintStringWithForloop {
    public static void main(String[] args) {
        String text = "Hello world";
        for(int num=0;num<text.length();num++){
            System.out.println(text.charAt(num));
        }
    }
}
