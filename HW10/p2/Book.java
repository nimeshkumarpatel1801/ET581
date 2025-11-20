package HW10.p2;

public class Book implements Comparable <Book>{
     String title;
      double price;

   public Book(String title,double price){
    this.title=title;
    this.price=price;
   }

    
   public int compareTo(Book other){
    return this.title.compareTo(other.title);
   }

   public String toString(){
      return this.title+"($"+ price+")";
   }


  
}
