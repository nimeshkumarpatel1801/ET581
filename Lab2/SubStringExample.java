public class SubStringExample {
    public static void main(String[] args) {
        // print "New York" using .substring(startingindex,endindex);
        String st1 = "Hello New York City";
        System.out.println(st1.substring(6,14));

        // print out index of "Nw" using indexof(string x")
        int index = st1.indexOf("New");
       System.out.println(index);

       // print substring from index 6;
       System.out.println(st1.substring(index));
        
    }
}
