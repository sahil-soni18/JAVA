package Java8_Features;

import java.util.Optional;

/*
 * Certainly, let's delve deeper into the Optional class in Java.

What is Optional?

Purpose: The Optional<T> class is a container object that may or may not hold a non-null value of type T.
NullPointerExceptions: NullPointerExceptions are a common source of bugs in Java. The Optional class helps to elegantly handle potential null values and avoid these exceptions.
Key Concepts

Empty Optional: Represents the absence of a value. Created using Optional.empty() or Optional.ofNullable(null).
Present Optional: Represents the presence of a value. Created using Optional.of(value).
Null Safety: The Optional class encourages you to explicitly handle the possibility of null values, making your code more robust and less prone to errors.
 */


public class OptionalClass {
    public static void main(String[] args) {
        Optional<String> optionalName = Optional.ofNullable("Sahil"); 

        // 1. Optional.ofNullable(null)
        // This creates an empty Optional object since the argument is null.
        // If the argument were not null, it would create a Present Optional 
        // holding the provided value.

        // 2. ifPresentOrElse(consumer, runnable)
        // This method checks if the Optional object contains a value:
        //    - If present: Executes the consumer (a functional interface) with the value.
        //    - If absent: Executes the runnable.

        optionalName.ifPresentOrElse(
            name -> System.out.println("Name: " + name), 
            () -> System.out.println("No name provided") 
        ); 

        // In this case, since optionalName is empty, 
        // the output will be: "No name provided"
    }
}
