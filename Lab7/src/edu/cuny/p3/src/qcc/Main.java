package edu.cuny.p3.src.qcc;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();// student has an address
        System.out.println(s.address.city); 
        System.out.println(s.address.zipCode);
    }
}
