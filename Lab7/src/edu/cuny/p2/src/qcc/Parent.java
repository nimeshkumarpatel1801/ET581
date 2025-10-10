package src.qcc;

public class Parent {
    public String name = "Parent";
    Parent(String name){
        this.name = name;
    }
    Parent(){
        this.name = "Parent";
    } 
    public String getname(){
        return this.name;
    }
    private void callMyName(){
        System.out.println("My name is " + this.name);
    }
}
