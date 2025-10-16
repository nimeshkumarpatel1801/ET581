package HW7.Part2;

public class Book {
    String title;
    double price;
    public Book(String title, double price){
        this.title = title;
        this.price = price;
    }
    void showInfo(){
        System.out.println("Title: " + title + ", Price: " + price);
    }
}
