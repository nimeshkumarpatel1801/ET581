import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();
        c1.add("A");
        c1.add("B");
        c1.add("C");        
        c1.add("D");
        Collection<String> c2 = new ArrayList<>();
        c2.add("A");
        c2.add("B");
        c2.add("F");
        Collection<String> c3 = new ArrayList<>();
        c3.add("X");
        c3.add("Y");
        c3.add("Z");
       // System.out.println(("collectionsall methods"+ c1.containsAll(c2)));
        //System.out.println("Before addAll method: " + c1);
      //  c1.addAll(c2);
        System.out.println("After addAll method: " + c1);
       // boolean removeAllResul = c1.removeAll(c2);
        boolean removeAllResul = c1.removeAll(c3);
        System.out.println("After removeAll method: " + c1);
        System.out.println(removeAllResul);
        c1.retainAll(c2);
        System.out.println("After retainAll method: " + c1);

    }
}