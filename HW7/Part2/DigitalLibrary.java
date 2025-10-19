package HW7.Part2;

public class DigitalLibrary {
    {
        String string = "DigitalLibrary instance block executed";
    }

    Ebook getBook() {
        return new Ebook("Java Basics", 15.0, 2.5);
    }
}
