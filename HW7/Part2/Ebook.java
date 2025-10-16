package HW7.Part2;

public class Ebook extends Book {
    double fileSize;

    public Ebook(String title, double price, double fileSize){
        super(title, price);
        this.fileSize = fileSize;
    }

    void showInfo(){
        System.out.println("Title: " + title + ", Price: " + price + ", File Size: " + fileSize + "MB");
    }

    double getFileSize(){
        return fileSize;
    }
    
}
