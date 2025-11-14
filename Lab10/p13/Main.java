package Lab10.p13;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Student,String> studentMap = new HashMap<>();
        Student s1 = new Student("A");
        Student s2 = new Student("A");
        studentMap.put(s1,"student A");
        System.out.println(studentMap);
        System.out.println(studentMap.get(s1));
        System.out.println(studentMap.get(s2));
    }
}
