import java.util.Scanner;

public class Readinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a integer");
        int number = input.nextInt();
        System.out.println("the number is" + number);
        input.close();
    }
}
