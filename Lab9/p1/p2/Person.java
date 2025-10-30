package p2;

abstract public class Person {
    static String name ="";
    Person(){
        name="unknown";
    }
     public String getname(){
        return name;
    }
    abstract int getAge();
}
