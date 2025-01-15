package Java8_Features;


/*
 * 4. Default and Static Methods in Interfaces
Why?
Interfaces can now have concrete methods (default and static), enabling backward compatibility without breaking existing implementations.
 */

interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default method in interface.");
    }

    static void staticMethod() {
        System.out.println("Static method in interface.");
    }
}


public class Default_Static_Methods implements MyInterface {
    public static void main(String[] args) {
        Default_Static_Methods example = new Default_Static_Methods();
        example.defaultMethod(); // Calls the default method

        MyInterface.staticMethod(); // Calls the static method
    }

}

/*
 * Explanation:

Default Method: Allows adding new methods to interfaces without affecting existing implementations.
Static Method: Provides utility methods that can be called on the interface itself.

 */