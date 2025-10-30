package p4;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.read();
        book.listen();
        Readable readable = book;
        readable.read();
        //readable.listen();
        Listenable listenable = book;
        listenable.listen();
        //listenable.read();
        Book book2 = (Book) readable;
        book2.listen();
        book2.read();

        book.read2();
        Readable.read3();
        System.out.println(Readable.x);
        book.samename();
        
    }
}
