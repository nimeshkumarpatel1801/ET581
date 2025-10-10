package edu.cuny.p5.src.qcc;

public  class Parent {
    final String Qcc = "qcc";
    final void print(){
        System.out.println("parent print method");
    }
    void printNonFinal(){
        System.out.println("parent printNonFinal method");
       // this.Qcc = "changed"; // compile error, final variable cannot be changed
    }
}
