package HW9.p2;

public class DVD extends MediaItem implements Playable {
    public DVD(String title) {
        super(title);
    }
    public void play(){
        System.out.println("playing DVD is"+ title);
    }
    public void displayInfo(){
        System.out.println("DVD title" +title);
    }
}
