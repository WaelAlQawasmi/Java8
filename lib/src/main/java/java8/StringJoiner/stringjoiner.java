package java8.StringJoiner;

import java.util.StringJoiner;

public class stringjoiner {
    public static void main(String[] args) {
        StringJoiner Joiner=new StringJoiner(" ");
        // ADD methode
        Joiner.add("wael");
        Joiner.add("khaleel");
        Joiner.add("abdel hafez");
        Joiner.add(" al qawasmi");

        // length methode
        System.out.println(Joiner.length()); //get you numer of char in string

        System.out.println(Joiner.setEmptyValue("88")); // if the String Joiner empty it will take this value 88

        System.out.println(Joiner);
    }
}
