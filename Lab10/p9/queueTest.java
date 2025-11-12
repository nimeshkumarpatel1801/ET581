package Lab10.p9;
import java.util.*;

public class queueTest {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        q1.offer(5);
        q1.offer(3);
        q1.offer(2);
        list.addAll(q1);
       // System.out.println(q1);
       // System.out.println("Peak is:" + q1.peek());
       // System.out.println(q1);
      //  System.out.println("Poll from the head :"+q1.poll());
        //System.out.println(q1);
      //  System.out.println(q1.element());
       // System.out.println(q1);
      //  System.out.println(q1.remove());
       // q1.remove();
       // q1.remove();
        //q1.remove();
      ListIterator<Integer> listIterator = list.listIterator();
      while (listIterator.hasNext()) {
            int x = listIterator.next();
            System.out.println(x);
      }
       
    }    
}
