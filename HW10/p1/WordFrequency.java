package HW10.p1;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "apple apple banana orange banana orange";
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        HashMap<String,Integer> map = new HashMap<>();
        while(tokenizer.hasMoreTokens()){
            String word= tokenizer.nextToken();
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }else{
                map.put(word, 1);
            }
        } 
       System.out.println(map.toString());
       for(Map.Entry<String,Integer> entry :map.entrySet()){
            System.out.println(entry.getKey()+ " =" + entry.getValue());
       }

       for(String key :map.keySet()){
            System.out.println(key);
       }
       
    }
}
