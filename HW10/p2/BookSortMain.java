 package HW10.p2;
 
 import java.util.*; 
public class BookSortMain { 
public static void main(String[] args) { 
        List<Book> books = new ArrayList<>(); 
        books.add(new Book("Java Programming", 39.99)); 
        books.add(new Book("Algorithms", 49.50)); 
        books.add(new Book("Data Structures", 29.75)); 
        books.add(new Book("Operating Systems", 59.00)); 
        Collections.sort(books); 
        System.out.println("Sorted by Title (A–Z):"); 
        for (Book b : books) { 
            System.out.println(b); 
        } 
    } 
} 