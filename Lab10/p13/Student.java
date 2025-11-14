package Lab10.p13;

import java.util.Objects;

public class Student {
    String name;
    int age;
    String address;
    public Student(String name){
        this.name = name;

    }
    public String toString(){
        return this.name;
    }
    public int hashCode(){
        return Object.hashCode(this.name,this.age,this.address);
    }
    public boolean equals(Object s){
        Student s1 = (Student) s;
        return this.name.equals(s1.name)&&this.age == s1.age&&this.address.equals(s1.address);
    }
}
