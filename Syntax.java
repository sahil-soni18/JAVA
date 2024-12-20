
import java.util.Scanner;   // Java Class to take User Input

public class Syntax {
    public static void main (String[] args) {
        // Java Print Statement
        System.out.println("Hello World!");

        // Control Flow In Java

        // If-else statements

        int x = 18; // Variable declaration

        if ( x > 0 ) {
            System.out.println("X is Positive!");
        } else if ( x < 0 ) { 
            System.out.println("X Is Negative!");
        } else {
            System.out.println("X is Equals 0!");
        }


        // Switch Statements

        Scanner scanner = new Scanner(System.in);  // Object Creation for Scanner Class.

        System.out.println("Enter the value of number: ");
        int number = scanner.nextInt(); // nextInt(): Method to take integer input.

        // Switch Statement to print the number only when if it is 2, 18 or 28 otherwise print Invalid.
        switch (number) {
            case 2 -> System.out.println(2);
            case 18 -> System.out.println(18);
            case 28 -> System.out.println(28);
            default -> System.out.println("Invalid");
        }

        // For Loop

        for ( int i = 0; i < 10; i++ ) {
            System.out.println(i);
        }

        // Array

        // Ways Of Declaring an Array In Java.

        // Way 1

        int[] numbersArray = new int[5];

        System.out.println(numbersArray);    // Prints the default toString() representation of the array object in Java.: [I@72a7c7e0

        numbersArray[0] = 2;
        numbersArray[1] = 18;
        numbersArray[2] = 28;
        numbersArray[3] = 1;
        numbersArray[3] = 3;
        // numbersArray[4] = 31;
        // numbersArray[5] = 100;    // Out of bounds.

        for ( int i = 0; i < numbersArray.length; i++ ) {
            System.out.println(numbersArray[i]);
        }

        // By default, all elements of an int array in Java are initialized to 0.

        // Way 2.

        int[] numbersArray2 = { 5, 2, 3, 18, 28 };

        System.out.println(numbersArray2.length);

        for ( int i = 0; i < numbersArray2.length; i++ ) {
            System.out.println(numbersArray2[i]);
        }

        // numbersArray2[5] = 100;   // Testing if this approach can expand the size of array.   Gives Out of bound error.

        scanner.close();   // Closing the scanner object.
    }
}