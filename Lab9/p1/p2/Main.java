package p2;

public class Main {
    public static void main(String[] args) {
       // Person p = new Person(); --- IGNORE ---
       // System.out.println(Person.getname());
      // Student s = new Student();   
       //  System.out.println(s.getname());
        // System.out.println(s.getAge());
        Professor prof = new Professor();
        System.out.println(prof.getname());
        System.out.println(prof.getAge());
        Person p1 = new Student();
        System.out.println(p1.getname());   
        System.out.println(p1.getAge());
    }
}
