import java.util.Scanner;


public class Ex10 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter Seconds:");
            int num = sc.nextInt();
            int hours = num / 3600;
            int min = (num % 3600)/60;
            int sec = (num % 60);

            System.out.println( hours + " hours "+ min + " minutes "  +  sec + " seconds");
        }
        input.close();
    }
}
