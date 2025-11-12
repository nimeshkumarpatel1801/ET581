import java.util.*;

public class StudentSet {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student("Alice"));
        set.add(new Student("bob"));
        Iterator<Student> StudentIt=set.iterator();
        while (StudentIt.hasNext()) {
            Student s = StudentIt.next();
            System.out.println(s);           
        }
        for(Student s: set){
            System.out.println(s);
        }
        System.out.println(set);
    }
}
