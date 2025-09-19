package Lab4;

public class PrintArrayColumn {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for(int r=0;r<arr.length;r++){
            System.out.print(arr[r][0]);
        }System.out.println();
        //second colum
          for(int r=0;r<arr.length;r++){
            System.out.print(arr[r][1]);
        }
        System.out.println();
        //Third colum
          for(int r=0;r<arr.length;r++){
            System.out.print(arr[r][2]);
        }System.out.println();

        //combin all to nested for loop
        for(int c=0;c<arr[0].length;c++){
              for(int r=0;r<arr.length;r++){
            System.out.print(arr[r][c]);
        }
        System.out.println();
        }
    }
}
