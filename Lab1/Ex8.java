import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 4 digit:");
            int num = sc.nextInt();
            
            int d1 = num/1000;
            int d2 = (num/100)% 10;
            int d3 = (num/10) % 10;
            int d4 = num % 10;

            System.out.println("Digit1= " + d1);
            System.out.println("Digit2= " + d2);
            System.out.println("Digit3= " + d3);
            System.out.println("digit4= " + d4);
        }
        input.close();
    }
}