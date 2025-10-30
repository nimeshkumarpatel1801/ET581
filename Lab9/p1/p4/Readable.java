package p4;

public interface Readable {
    public static final int x =5;// static final ==> constant
    void read();
    default void read2(){
        System.out.println(" This is new Reading 2");
    }
    static void read3(){
        System.out.println(" This is static  method in Readable");
    }
    default void samename(){
        System.out.println("this is readable default method");
    }
}
