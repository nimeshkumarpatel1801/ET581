package HW7.Part2;

public class Main {
    public static void main(String[] args) { 
        Book b1 = new Ebook("AI in Education", 12.5, 1.8); 
        b1.showInfo();  

        DigitalLibrary lib = new DigitalLibrary(); 
        Book b2 = lib.getBook(); 
        b2.showInfo();  

        System.out.println("Program finished."); 
    }
}
