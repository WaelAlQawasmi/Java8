/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package java8;

import java.util.*;
import java.util.stream.Collectors;

public class Library {
    public Library(int x) {

    }

    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {

// ex1
        System.out.println("use lambda with interface");
        // in this example I build interface and create methode on it that crete lambda based on calculate (abstract methode)
        RerInterface lambda = (x) -> System.out.println(2 * x);
        lambda.calculate(100);

// ex2
        System.out.println("use defult methode");
        // in java 8 you can add un abstract methode
        lambda.java8Defult();
//ex3
        System.out.println("use lambda with foreach");
        // in this example I create labda forEach
        Integer[] test = {20, 10, 40, 30};
        ArrayList<Integer> labpdaTest = new ArrayList<Integer>(Arrays.asList(test));
        labpdaTest.forEach(x -> System.out.println(x + 200));

//ex 4 stream //////////////////////
        System.out.println("convert integer to int");
        // in this exam i will convert Integer to int
        int[] intNumber = labpdaTest.stream().mapToInt(Integer::intValue).toArray();

        Arrays.stream(intNumber).forEach(x -> System.out.println(x));
//ex 4 stream //////////////////////
        // get reserlt of strem as
        System.out.println(labpdaTest.stream().mapToInt(x -> x).average().getAsDouble()); // to get average
        System.out.println(labpdaTest.stream().mapToInt(x -> x + 20).average().getAsDouble()); // we can manipulate values in list
        System.out.println(labpdaTest.stream().mapToInt(x -> x).max().getAsInt()); // get max
        System.out.println(labpdaTest.stream().filter(x -> x < 30).collect(Collectors.toList())); // to filter data

        //Collectors are used to combine the result of processing on the elements of a stream.
        System.out.println(labpdaTest.stream().map(x -> x + 20).collect(Collectors.toList()));
        System.out.println(labpdaTest.stream().map(x -> x + 20).sorted().collect(Collectors.toList()));
        System.out.println(labpdaTest.stream().map(x -> x + 20).reduce((x, y) -> x + y).get());

        // Collectors can be used to return a list or a string.
        String[] words = {"wael ", "k ", " Al Qawasmi "};
        System.out.println(Arrays.stream(words).collect(Collectors.joining("@")));

        //Statistics
        // With Java 8, statistics collectors are introduced to calculate all statistics when stream processing is being done.
        IntSummaryStatistics summery = labpdaTest.stream().mapToInt(x -> x).summaryStatistics();

        System.out.println(summery.getMax());
        System.out.println(summery.getMin());
        System.out.println(summery.getAverage());
        System.out.println(summery.getCount());

// The double colon (::) operator,
        // also known as method reference operator in Java,
        // is used to call a method by referring to it with the help of its class directly.
        // <Class name>::<method name>
        System.out.println("::");

        labpdaTest.stream().forEach(System.out::println);


        RerInterface refferance = Library::printString;


        Library LIb = new Library(5);
        RerInterface Ref0 = LIb::Clc;
        Ref0.calculate(10);

        RerInterface Ref = Library::new;
        Ref.calculate(10);

        RerInterface ref0 = Library::printString;
        ref0.calculate(200);
// optional class
        String []xss=  new String [10]; // array
        Optional<String>checkNull=Optional.ofNullable(xss[5]); // to check if null
if(checkNull.isPresent()) { //isPresent to check if null
    System.out.println("hi, i have value");
}

    }

    private static void printString(int i) {
        System.out.println("Hi");
    }

    private void Clc(int i) {
        System.out.println("Hi");
    }

}
