package Lab5;

import java.util.Arrays;

public class ArrayWithMethod {
    static void arrayElementUpdate(int e){
        e=10;
    }
    static void updatedArray(int[] arr){
        arr[1]=20;
    }
    public static void main(String[] args) {
       int[] array= new int[3];
       System.out.println(Arrays.toString(array));
         arrayElementUpdate(array[1]);
            System.out.println(Arrays.toString(array));
            updatedArray(array);
            System.out.println(Arrays.toString(array));
            
    }
}
