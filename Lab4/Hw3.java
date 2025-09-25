package Lab4;
import java.util.StringTokenizer;

public class Hw3 {
    public static void main(String[] args) {
        String sentence = "Hello World";
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        while(tokenizer.hasMoreTokens()){
            String word = tokenizer.nextToken();
            String reversedWord = "";
            for(int i=word.length()-1;i>=0;i--){
                reversedWord += word.charAt(i); 
            }
            System.out.println(reversedWord);
        }
    }
}
