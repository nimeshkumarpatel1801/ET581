package Lab10.p1.p3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();
        c1.add("A");
        c1.add("B");
        c1.add("C");        
        c1.add("D");
       Iterator<String> it = c1.iterator();
       while (it.hasNext()) {
            String element = it.next();
            if (element.equals("C")) {
                break;
            }
            System.out.println("Element: " + element);
       } 
       for (String e:c1){
        System.out.println("Element using for each loop: " + e);
        if (e.equals("C")) {
            c1.remove(e);
        }
       }
         System.out.println("Collection after removal: " + c1);
       
    }
}
