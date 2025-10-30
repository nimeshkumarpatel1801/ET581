package p4;

public interface Listenable {
    void listen();
    default void samename(){
        System.out.println("this is listenable default method");
    }
}
