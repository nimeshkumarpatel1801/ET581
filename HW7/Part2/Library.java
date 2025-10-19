package HW7.Part2;

public class Library {
   Book vook;
  {
    String string = "Library instance block executed";
  }
    Book getBook(){
       return new Book("Unknown", 10.0);
    }
}
