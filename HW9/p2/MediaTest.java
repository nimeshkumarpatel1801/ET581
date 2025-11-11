package HW9.p2;

import java.util.*;

public class MediaTest {
    public static void main(String[] args) {
        List<MediaItem> items = new ArrayList<>();
        items.add(new Book("mahabhart"));
        items.add(new Book("ramayan"));
        items.add(new DVD("kantara"));
        items.add(new DVD("Omg"));
        items.add(new CD("Aankhon mein"));
        items.add(new CD("Softy"));
        int BookCounter = 0;
        int DvdCounter = 0;
        int CdCounter = 0;
        for(MediaItem item: items){
            item.displayInfo();
            if (item instanceof Readable) {
                ((Readable)item).read();
                BookCounter++;
            }
            else if(item instanceof Playable){
                ((Playable)item).play();
                if (item instanceof DVD){
                    DvdCounter++;
                }
                else if(item instanceof CD){
                    CdCounter++;
                }
            }
            System.out.println();
        }
        System.out.println("Total Books: "+ BookCounter);
        System.out.println("Total DVD: "+ DvdCounter);
        System.out.println("Total CD:" + CdCounter );
    }
}
