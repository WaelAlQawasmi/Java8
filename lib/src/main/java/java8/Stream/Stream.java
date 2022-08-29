package java8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class Stream {
    static int[] arrayTest = {10, 89, 27, 9,9,9,8,8};
    // convert from int to integer
    static ArrayList<Integer> arrayListTest = new ArrayList<Integer>(Arrays.stream(arrayTest).boxed().collect(Collectors.toList()));
    // to convert from Integer ti int
    static int[] arrayTest2 = arrayListTest.stream().mapToInt(Integer::intValue).toArray();


    public static void main(String[] args) {
        Statistics();
        sorting();
        modification();

    }

    public static void modification() {
        // LIMIT AND skip
       System.out.println(arrayListTest.stream().limit(2).skip(1).collect(Collectors.toList()));
       // reduce to get the preserve element and current element
       System.out.println(arrayListTest.stream().reduce((x,y)->x+y).get());
       // find first
        System.out.println(arrayListTest.stream().findFirst().get());
        // filter
        System.out.println(arrayListTest.stream().filter(x->x>10).collect(Collectors.toList()));


    }
    public static void sorting() {
        System.out.println(arrayListTest);
        // sorting
        System.out.println(arrayListTest.stream().sorted().collect(Collectors.toList()));
        // reverse sorting
        System.out.println(arrayListTest.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        // limit and distinct( to prevent doublecated)
        System.out.println(arrayListTest.stream().limit(5).distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

    }

    public static void Statistics() {
        // first way to get
        double avarege = arrayListTest.stream().mapToInt(x -> x).average().getAsDouble();
        System.out.println(avarege);
        // Second way to get
        IntSummaryStatistics SummeryStatistics = arrayListTest.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println(SummeryStatistics.getMin());
        // 3rd way to get
        double reselt = arrayListTest.parallelStream().mapToInt(x -> x).sum();
        System.out.println(reselt);
        // 4th way to get
        String word =arrayListTest.stream().map(x-> x.toString()).collect(Collectors.joining("+"));

        System.out.println(word);

    }






}
