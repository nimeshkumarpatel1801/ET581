package Lab5;
import java.lang.Math;

public class Homewrok2 {
    //method to create a 2D array filled with random numbers from 0 to 100;
    static int[][] createRandom2DArray(int rows, int cols){
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                //math.random() generates a random double between 0.0 and 1.0
                //we multiply by 101 to get a range from 0 to 100
                array[i][j] = (int)(Math.random() * 101); //random number between 0 and 100
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[][] randomArray = createRandom2DArray(4,5);
        //print the 2D array
        for (int i = 0; i < randomArray.length; i++){
            for (int j = 0; j < randomArray[i].length; j++){
                System.out.print(randomArray[i][j] + "\t ");
            }
            System.out.println();
        }
    }

}
