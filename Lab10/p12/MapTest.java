import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
         Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(5, "Five");
        map.put(3, "Three");
        System.out.println(map);
        Map<String,String> map2 = new HashMap<>();
        map2.put("one", "This is the one");
        map2.put("Five", "This is the five");
        map2.put("Three", "This is the three");
        System.out.println(map2);

        System.out.println(map.get(5));
        System.out.println(map2.get("Three"));
        System.out.println(map2.get("three"));// if not found key from map

       Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        for(Map.Entry<Integer,String> entry : map.entrySet()){
                System.out.println(entry.getKey() + "="+ entry.getValue());
        }

    }
}
