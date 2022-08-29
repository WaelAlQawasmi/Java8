

# Java 8
## Method References
- Java provides a new feature called method reference in Java 8. Method reference
is used to refer method of functional interface. 
- Types of Method References
* There are following types of method references in java:

  1. Reference to a static method.
  2. Reference to an instance method.
  3. Reference to a constructor.
* [Reference](https://www.javatpoint.com/java-8-method-reference)
* [my work ](lib/src/main/java/java8/MethodReference)

## Functional Interface
- An Interface that contains only one abstract method is known as functional interface.
## default methode in interface
- in java 8 you can add un abstract methode
>  default void java8Defult(){
System.out.println("I am default");
}

## Optional Class
- It is a public final class and used to deal with NullPointerException in Java application
>  Optional<String> checkNull
= Optional.ofNullable(words[5]);

- isPresent() : to check if not null
- get(): to get the value
- [my work](lib/src/main/java/java8/Optional)

## forEach
- ava provides a new method forEach() to iterate the elements. It is defined in Iterable and Stream interfaces
## Nashorn JavaScript Engine
- you can run js code by after read the file

## StringJoiner
- StringJoiner is a class in java.util package is
 used to construct a sequence of characters(strings) 
separated by a delimiter and optionally starting with
 a supplied prefix and ending with a given suffix
- [my work](lib/src/main/java/java8/StringJoiner)

## Stream
Introduced in Java 8, the Stream API is used to process collections of objects. A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
- [my work](lib/src/main/java/java8/Stream)
## ref
1. [ref](https://www.javatpoint.com/java-8-features)
2. [ref2](https://www.javatpoint.com/java-8-method-reference)
3. [ref2](https://www.geeksforgeeks.org/java-8-optional-class/)