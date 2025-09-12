package Lab3;


public class ArrayDeclare {
    public static void main(String[] args) {
        int[] arr = new int[3];
        double[] num = new double[3];
        String[] st = new String[3];
        boolean[] bl = new boolean[3];
        for(int index =0; index<arr.length;index++){
            System.out.println(arr[index]);
            System.out.println(num[index]);
            System.out.println(st[index]);
            System.out.println(bl[index]);
        }

        System.out.println("=========================================================");
        //
        int[] srr1 ={1,2,3,4};
        for(int index = 0; index<srr1.length;index++){
            System.out.println(srr1[index]);
        }
    }
    
}