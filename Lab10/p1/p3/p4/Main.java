package Lab10.p1.p3.p4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        Collection<String> c1 = l1;
        l1.add("A");
        l1.add("B");
        l1.add("C");        
        l1.add("D");
        for(int i =0; i<l1.size();i++){
            System.out.println("Element at index "+ i + ": " + l1.get(i));
        }
        System.out.println("Collection before set method: " + l1);
       // l1.set(0,"X");
      // l1.add(0,"X");
       l1.add(0,"D");
        System.out.println("After set method: " + l1);
        System.out.println(l1.indexOf("D"));
        System.out.println(l1.lastIndexOf("D"));
        for (int i =0; i<l1.size();i++){
            Iterator<String> it = l1.iterator();
            it.remove();
            System.out.println("Element at index "+ i + ": " + l1.get(i));
            if (i == 2){
                l1.remove(i);
            }
        }
    }
}
