package Lab3;
import java.util.Scanner;


public class Homework3Part2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string: ");
        String words = sc.nextLine();
        System.out.println("Original string : "+ words);
        String reversewords = "";
        for(int i= words.length() -1;i>=0;i--){
            reversewords = reversewords+words.charAt(i);
        }
        System.out.println("reversed : "+reversewords);
        int vowel = 0;
        
    }
}
