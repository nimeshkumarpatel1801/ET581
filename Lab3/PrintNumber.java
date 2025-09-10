package Lab3;
import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        int num = 1;
        //while
        while ( num <6) {
            System.out.println(num);
            num++;
        }


        //Password checking 
        Scanner sc = new Scanner(System.in);
        String pass = "Nimesh18";
        System.out.println("Please Enter password");
        String Enter = sc.nextLine();
        while (!Enter.equals(pass)) {
            System.out.println("Wrong Password");
            System.out.println("Please enter ");
             Enter = sc.nextLine();
        }
        System.out.println("Password is correct");
        sc.close();
    }
}
