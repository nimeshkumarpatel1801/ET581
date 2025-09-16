package Lab3;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.sound.sampled.SourceDataLine;


public class Homework3Part2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string: ");
        String words = sc.nextLine();
        System.out.println("Original string : "+ words);
        String reversewords = "";
        for(int i= words.length() -1;i>=0;i--){
            reversewords = reversewords+words.charAt(i);
        }
        System.out.println("reversed : "+reversewords);
        int vowel = 0;
        
        for(int i=0; i<words.length();i++){
            char ch=words.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o'){
                vowel++;
            }
                
            }
         }
        System.out.println(vowel);
     
      sc.close();
        }
    
    }

