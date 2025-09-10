package Lab3;

public class PrintString {
    public static void main(String[] args) {
        String text = "Hello world";
        int num =0;
      
        while (num<= text.length()) {//condition
            System.out.println(text.charAt(num));//statement
            num++;//update
            
        }
    }
}
