package Lab3;
import java.util.Scanner;

public class HW3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] number = new int[n];
        System.out.println("Enter "+ n +" numbers:");
        for(int i=0;i<n;i++){
            number[i] =sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum +number[i];
        }
        System.out.println("sum is: "+sum);
        double avg = sum/n;
        System.out.println("avg is: "+avg);
        int max = number[0];
        int min = number[0];
        for(int i=0;i<n;i++){
            if (number[i] < min) {
                min = number[i];
            }
            if (number[i] > max) {
               max = number[i];
            }
        }
        System.out.println("min is :"+min);
        System.out.println("max is:"+max);

       
        System.out.println("==========================================================================");
        
        
        String Str = sc.nextLine();
        System.out.println(Str);
       
       
     
    }
}