package Lab4;

public class PrintTriangle {
    public static void main(String[] args) {
       int n =5 ;
       System.out.println("----------------------------------");
    //    for(int i=0;i<n;i++){
    //     System.out.print("* ");              //this is for one line as down you can show we do n-i it make small.
    //    }

        for(int i=0;i<=4;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------");
        int num=1;
        // for(int i=0;i<=5;i++){
        //     for(int j=0;j<n+i;j++){
        //         System.out.print("* ");
        //     }
        // }
        // for(int i=0;i<2;i++){
        //     System.out.print("* ");
        // }
        for(int j=0;j<=5;j++){
            for(int i=0;i<j;i++){
            System.out.print("* ");
        }
        System.out.println();
        }
    }
}
