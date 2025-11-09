import java.util.*;

public class Ren{
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for(int i=0; i<20; i++){
             int n =(int)(Math.random() * 101); 
            num.add(i,n);
        }
        System.out.println("Original list: " + num);
        for(int i=0; i<num.size();i++){
            if(num.get(i) % 2 == 0){
                even.add(num.get(i));
            }else{
                odd.add(num.get(i));
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
        System.out.println("========================================    ====================    ====================");

        Iterator<Integer> it = num.iterator();
        while(it.hasNext()){
            int bigNum = it.next();
            if (bigNum < 10) {
                it.remove();
            }
        }
        System.out.println("final list"+ num);

    }
}