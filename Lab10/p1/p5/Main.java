package Lab10.p1.p5;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("A");
        l1.add("B");
        l1.add("C");        
        l1.add("D");
        ListIterator<String> lit = l1.listIterator();
        Iterator<String> regularIterator = l1.iterator();
        while (lit.hasNext()) {
            String element = lit.next();
            if(element.equals("C")){
                lit.add("X");
            }
            //l1.add(0,"X");
            System.out.println("Element: " + element);
        }   
        System.out.println("List after modification: " + l1);
        
       // while (lit.hasPrevious()) {
           // String element = lit.previous();
           // System.out.println("Element in reverse order: " + element);
       // } 
    }
}
