
import java.util.Scanner;   // Java Class to take User Input

public class Syntax {
    public static void main (String[] args) {
        // Java Print Statement
        System.out.println("Hello World!");

        // Control Flow In Java

        // If-else statements

        int x = 18; // Variable declaration

        if ( x > 15 ) {
            System.out.println("X is greater then 15!");
        } else {
            System.out.println("X is Lesser then 15!");
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

        scanner.close();   // Closing the scanner object.
    }
}