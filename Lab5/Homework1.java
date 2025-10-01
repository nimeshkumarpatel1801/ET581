package Lab5;

public class Homework1 {
    //method to find maximum value in an array
    static int maxArray(int[] array){
        //start with the first element as the maximum
        int max = array[0];

        //compare with each element in the array using Math.max
       for (int i = 1; i < array.length; i++){
            max = Math.max(max, array[i]);
       }
       return max;
    }
    public static void main(String[] args) {
        int[] array = {23,34,56,67,87};
        System.out.println(maxArray(array));//we call method and print the maximum value
    }
}
