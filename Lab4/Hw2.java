package Lab4;

public class Hw2 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        
       for(int i=0;i<arr[1].length;i++){
        int sum =0;
         for(int r=0;r<arr.length;r++){
            sum =sum + arr[r][i];
         }
            System.out.println("Sum of column "+i+":"+sum);
       }
     }
    }

