package edu.cuny.p4.src.qcc;

public class Dog  extends Animal{
    static {
        System.out.println("Dog Static block");
    }
    {
        System.out.println("Dog Instance block");
    }
    Dog(){
        //super();
        System.out.println("Dog Constructor");
    }
    public void sound(){ // override in class 
        System.out.println("Dog barks");
    }
    public void sound(int i){ // overload in class
        System.out.println("Dog barks "+ i + " times");
    }
}
