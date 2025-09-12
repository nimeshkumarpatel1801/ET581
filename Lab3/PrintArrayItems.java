package Lab3;

public class PrintArrayItems {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        for(int index = 0; index<intArr.length;index++){
            System.out.println("indexis : "+index+ " value is : "+intArr[index]);
        }
        System.out.println(intArr.getClass().getName());

        System.out.println("========================================================================");

        for(int item : intArr){
            System.out.println("indexis : "+item+ " value is : ");//+intArr);
        }
    }
}
