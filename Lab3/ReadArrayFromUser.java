package Lab3;
import java.util.Scanner;

public class ReadArrayFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i =0;i<arr.length;i++){
            System.out.println("Please enter int value:");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
