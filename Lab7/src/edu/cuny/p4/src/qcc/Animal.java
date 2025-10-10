package edu.cuny.p4.src.qcc;

public class Animal {
    static {
        System.out.println("Animal Static block");
    }
    {
        System.out.println("Animal Instance block");
    }
    Animal(){
        System.out.println("Animal Constructor");
    }
    public void sound(){
        System.out.println("Animal sound");
    }
}
