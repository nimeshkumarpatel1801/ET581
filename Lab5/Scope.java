package Lab5;

public class Scope {
    public static void main(String[] args) {
       int j =0;

    //    for(int i =0;i<5;i++){
    //     System.out.println(i);
    //    }
    //    if (j==0) {
    //     int insideoff = 0;
    //    }
    //    System.out.println(insideOff);
        int y=2;
        {
            int x=1;
            System.out.println(x);
            System.out.println(y);
        }
         System.out.println(y);
       // System.out.println(x);
    }
}
