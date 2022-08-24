package java8.MethodReference;

public interface refInterface {
    void calculate(int x);

    default void java8Defult(){ // in java 8 you can add un abstract methode
        System.out.println("I am default");
    }
    default void java8Defult2(){ // in java 8 you can add un abstract methode
        System.out.println("I am moving");
    }

}
