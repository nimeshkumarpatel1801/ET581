package src.qcc;

public class Main {
    public static void main(String[] args) {
        Parent p1 =  new Parent("Devil");
        System.out.println(p1.name);
    
        Child c1 = new Child();
        System.out.println(c1.name);
        System.out.println(c1.school);
        c1.getname();
      //  c1.callMyName(); // compile error, callMyName() is private
    }
}
