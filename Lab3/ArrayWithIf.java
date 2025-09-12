package Lab3;

public class ArrayWithIf {
    public static void main(String[] args) {
        int[] arr = new int[20];

        // for(int i =0;i<arr.length;i++){
        //     if (i%2==0) {
        //         arr[i]=1;
        //     }
           
        //     System.out.println("index is : "+i+"num : " +arr[i]);


        int i = 0;
        while (i<arr.length) {
            if (i%2==0) {
                arr[i]=1;
            }
            System.out.println("index : "+i+ "value : "+arr[i]);
            i++;
        }
        }
       
        
    }

