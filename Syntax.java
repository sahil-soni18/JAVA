import java.util.Scanner;
import java.util.ArrayList;

public class Syntax {

    public static void main(String[] args) {
        // User Input
        Scanner scanner = new Scanner(System.in);

        // Print Statement
        System.out.println("Hello, World!");

        // Control Flow: If-else Statements
        System.out.println("\nControl Flow: If-else Statements");
        int x = 18;
        if (x > 0) {
            System.out.println("X is positive!");
        } else if (x < 0) {
            System.out.println("X is negative!");
        } else {
            System.out.println("X is equal to 0!");
        }

        // Control Flow: Switch Statements
        System.out.println("\nControl Flow: Switch Statements");
        System.out.print("Enter a number (2, 18, or 28): ");
        int number = scanner.nextInt();
        switch (number) {
            case 2:
            case 18:
            case 28:
                System.out.println(number);
                break;
            default:
                System.out.println("Invalid number!");
        }

        // Loop: For Loop
        System.out.println("\nLoop: For Loop");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // Arrays
        System.out.println("\nArrays");
        int[] numbersArray = new int[5];

        // Array Initialization
        System.out.println("Array Initialization - Way 1:");
        numbersArray[0] = 2;
        numbersArray[1] = 18;
        numbersArray[2] = 28;
        numbersArray[3] = 1;
        numbersArray[4] = 3;

        // Printing Array Elements
        System.out.println("Printing Array Elements:");
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println(numbersArray[i]);
        }

        // Array Literal (Shorter Initialization)
        System.out.println("\nArray Initialization - Way 2 (Array Literal):");
        int[] numbersArray2 = {5, 2, 3, 18, 28};
        System.out.println("Array Length: " + numbersArray2.length);

        // Printing Array Elements (using enhanced for loop)
        System.out.println("Printing Array Elements (Enhanced for loop):");
        for (int num : numbersArray2) {
            System.out.print(num + " ");
        }

        // ArrayList (Dynamic Arrays)
        System.out.println("\nArrayList (Dynamic Arrays)");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(18);
        arrayList.add(28);
        arrayList.add(2);
        arrayList.add(3);

        // ArrayList Operations
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("Element at index 1: " + arrayList.get(1));

        // Printing ArrayList Elements
        System.out.println("Printing ArrayList Elements:");
        for (int num : arrayList) {
            System.out.print(num + " ");
        }

        scanner.close(); // Closing the scanner object
    }
}