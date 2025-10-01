package Lab5;

public class Homework4 {
    static void swap(int[] array, int index1, int index2){
        //use a temporary variable to hold one of the values during the swap
        int temp = array[index1];//store value at index1 in temp
        array[index1] = array[index2];//put value at index2 into index1
        array[index2] = temp;//swap the value from temp into index2
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Before swap:");
        for (int num : array){
            System.out.print(num + " ");            
        }
        System.out.println();
        //swap elements at index 1 and 3
        swap(array, 1, 3);//should swap 20 and 40
        System.out.println("After swap:");
        //print the array after swap
        for (int num : array){
            System.out.print(num + " ");    
        }
        // output should be: 10 40 30 20 50
        System.out.println();
    }
}
