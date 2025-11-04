package HW8.P2;

public class MediaTest {
     public static void main(String[] args) {
        Playable[] players = new Playable[2];
        players[0] = new MusicPlayer();
        players[1] = new VideoPlayer();

        System.out.println("=== Media Test ===");
        for (Playable p : players) {
            p.play();
            p.pause();
            p.stop();
            System.out.println();
        }
    }
}
