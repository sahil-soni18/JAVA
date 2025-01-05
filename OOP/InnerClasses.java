package OOP;


// Java allows you to define a class inside another class, which is known as an inner class.

// TYPES:

// 1. Member Inner Class

// Defined within a class but outside any method.
class OuterType1 {
    private String message = "Hello from Outer class";

    class InnerType1 {
        public void displayMessage() {
            System.out.println(message);
        }
    }
}

// 2. Local Inner Class

// Defined within a method.

class OuterType2 {

    // Method inside outer class
    void outerMethod()
    {

        // Print statement
        System.out.println("inside outerMethod");

        // Class 2
        // Inner class
        // It is local to outerMethod()
        class InnerType2 {

            // Method defined inside inner class
            void innerMethod()
            {

                // Print statement whenever inner class is
                // called
                System.out.println("inside innerMethod");
            }
        }

        // Creating object of inner class
        InnerType2 y = new InnerType2();

        // Calling over method defined inside it
        y.innerMethod();
    }
}




public class InnerClasses {
    public static void main(String[] args) {

        // Member Inner Class
        OuterType1 outer1 = new OuterType1();
        OuterType1.InnerType1 innertype1 = outer1.new InnerType1();
        innertype1.displayMessage();

        // Local Inner Class
        OuterType2 outer2 = new OuterType2();
        outer2.outerMethod();

        // Type 3: Anonymous Inner Class in Anonymous_Inner_Class.java


    }
}
