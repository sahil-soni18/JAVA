package Java8_Features;

import java.util.ArrayList;
import java.util.List;

/*
 * Stream API
What is the Stream API?
A sequence of elements supporting various operations to process data declaratively.
Common operations: filter, map, reduce, forEach, and collect.
 */
public class STREAM_API {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Filter even numbers and print them
        numbers.stream()
               .filter(num -> num % 2 == 0) // Keep only even numbers
               .forEach(System.out::println); // Print each number
    }
}

/*
 * System.out::println:

This is a method reference.
It's a shorthand way of creating a lambda expression that refers to a static method.
System.out::println is equivalent to the lambda expression (element) -> System.out.println(element).
This lambda expression takes an element as input and passes it to the println() method of the System class for printing to the console.
 */
