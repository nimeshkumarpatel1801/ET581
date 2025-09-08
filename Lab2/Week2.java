import java.util.StringTokenizer;
import java.util.Scanner;

public class Week2 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a sentence:");
        String str1 = sc.nextLine();
        System.out.println("Sentence length:"+str1.length());
        int index = str1.indexOf("Java");
        System.out.println("index is: "+index);
       if (index == -1){
            System.out.println("terminate main method...");
            return;
        }
         String str2 = str1.substring(index);
         System.out.println("Substring: "+str2);
         StringTokenizer st = new StringTokenizer(str2);
         String First = st.nextToken();
         String Second = st.nextToken();
         System.out.println("firstword:"+First);
         System.out.println("secondword:"+Second);
         System.out.println("first word length: "+First.length());
         System.out.println("second word length: "+Second.length());
         if (First.length()==Second.length()) {
          System.out.println("Firstword.length() = Secondword.length()");
         } else if (First.length()>Second.length()) {
          System.out.println("First.length() > second.length()");
         }
         else {
          System.out.println("First.length() < second.length()");
         }
         System.out.println("concatenated: "+First.concat(Second));
         if ("Java".equals(First) || "Java".equals(Second)) {
          System.out.println("One of the words is Java");
         }
         switch (First) {
          case "Java":
            System.out.println("You like Java !");
            break;

          case "Python":
            System.out.println("You like python !");
            break;
         
          default:
            System.out.println("Other language detected");
            break;

         }

         sc.close();



    


    }
}
