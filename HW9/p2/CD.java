package HW9.p2;

public class CD extends MediaItem implements Playable {
     public CD(String title) {
        super(title);
    }
    public void play(){
        System.out.println("Playing CD is"+title);
    }
    public void displayInfo(){
        System.out.println("CD title: "+ title);
    }
}
