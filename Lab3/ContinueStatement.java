package Lab3;
public class ContinueStatement {
    public static void main(String[] args) {
        for(int i=1; i<=5;i++){
            if (i%2==0) {// for even number 
                continue;
            }
            System.out.println("i = "+i);
        }
    }
}
