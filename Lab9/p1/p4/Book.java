package p4;

public class Book implements Readable , Listenable{
    
    @Override
    public void read(){
        System.out.println("Reading Book");
    }

    @Override
    public void listen(){
        System.out.println("Listening Book");
    }
     
    public void samename(){
        Readable.super.samename();
        Listenable.super.samename();
        System.out.println("this is Book class method");
    }

}
