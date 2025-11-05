import java.util.*;

class Main{
    public static void main(String[] args) {
        Collection c1= new ArrayList<String>();
        System.out.println(c1.size());
        System.out.println(c1.isEmpty());
        System.out.println(c1);
        System.out.println("------------------- After adding elements -------------------");
        c1.add("Apple");
        c1.add("orange");
        c1.add("mango");
        System.out.println(c1.size());
        System.out.println(c1.isEmpty());
        System.out.println(c1);
        System.out.println(c1.contains("grape"));
        c1.remove("orange");
        System.out.println(c1);
        c1.clear();
        System.out.println(c1);
    }
}