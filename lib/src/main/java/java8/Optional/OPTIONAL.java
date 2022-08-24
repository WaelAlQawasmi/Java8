package java8.Optional;

import java.util.Locale;
import java.util.Optional;

public class OPTIONAL {
    static String[] test = {"hi", "yes"};

    public static void main(String[] args) {
        //  NullPointerException(); // to test  NullPointerException

        Optional<String> notNull=Optional.ofNullable(test[0]);
        Optional<String> NullValue=Optional.ofNullable(test[0]);

        if(notNull.isPresent()){
            System.out.println("yes and my value is "+ notNull.get().toUpperCase(Locale.ROOT)); // get to get the value of it
        }

        if(NullValue.isPresent()){ // isPresent to check if value present or not
            System.out.println("NO  I don't have value");
        }
    }

    static void NullPointerException() {

        System.out.println(test[3].charAt(0));
    }
}
