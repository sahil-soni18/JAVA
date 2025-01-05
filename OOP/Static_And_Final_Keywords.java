package OOP;


/*
 * a. Static Keyword:
        Used for class-level methods or variables.
        Belongs to the class rather than an instance.
 */

 class MathUtility {
    static int square(int number) {
        return number * number;
    }
}

/*
 * b. Final Keyword:
        A final variable cannot be reassigned.
        A final method cannot be overridden.
        A final class cannot be extended.
 */

class FinalDemo {
    final int MAX_VALUE = 99;

    void myMethod() {
        // MAX_VALUE = 101; // will generate an error
    }
}

public class Static_And_Final_Keywords {
    public static void main(String[] args) {
        System.out.println("The Sqaure of number is: " + MathUtility.square(5));
    }
}
