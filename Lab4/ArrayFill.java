package Lab4;
import java.util.Arrays;

public class ArrayFill {
    public static void main(String[] args) {
        int[] a= new int[3];
        System.out.println(Arrays.toString(a));

        for(int i=0;i<a.length;i++){
            a[i]=1;
        }
        System.out.println(Arrays.toString(a));
      

    }
}
