package HW9.p2;

public class Book extends MediaItem implements Readable {
    
    public Book(String title) {
        super(title);
    }
    public void read(){
        System.out.println("Reading this book"+ title);
    }
    public void displayInfo() {
        System.out.println("Book Title: " + title);
    }
}
