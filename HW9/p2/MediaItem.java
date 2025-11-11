package HW9.p2;

public abstract class MediaItem {
    public String title;
    public MediaItem (String title){
        this.title = title;
    }
    public abstract void displayInfo();
}
