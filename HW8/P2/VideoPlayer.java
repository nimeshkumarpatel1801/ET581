package HW8.P2;

public class VideoPlayer implements Playable {
    public void play() {
        System.out.println("Playing video...");
    }
    public void pause(){
        System.out.println("Pausing video...");
    }
    public void stop(){
        System.out.println("Stopping video...");
    }
}
