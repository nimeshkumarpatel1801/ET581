package Lab4;

public class Hw1 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=0;j<arr[i].length;j++){
                sum =sum + arr[i][j];
               
            }
             System.out.println("Sum of row "+i+":"+sum);
            System.out.println();
        }
    }
}
