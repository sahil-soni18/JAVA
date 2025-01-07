package Collection_Framework;

/*
 * What is ArrayList?

    A resizable array that allows duplicate elements.
    Maintains insertion order.
 */

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> Dynamic_Array = new ArrayList<>();

        Dynamic_Array.add("Java");
        Dynamic_Array.add("Python");
        Dynamic_Array.add("JavaScript");
        Dynamic_Array.add("C++");

        System.out.println("Original Array: " + Dynamic_Array);

        Dynamic_Array.add(2, "Ruby");
        System.out.println("Array after adding Ruby at index 2: " + Dynamic_Array);

        Dynamic_Array.remove(3);
        System.out.println("Array after removing element at index 3: " + Dynamic_Array);
        Dynamic_Array.set(1, "C");
        System.out.println("Array after setting element at index 1 to C: " + Dynamic_Array);

        System.out.println("Element at index 2: " + Dynamic_Array.get(2));
        System.out.println("Index of Python: " + Dynamic_Array.indexOf("Python"));

        System.out.println("Size of Array: " + Dynamic_Array.size());

        for (String element : Dynamic_Array) {
            System.out.println(element);
        }
    }
}

// Output:
/*Original Array: [Java, Python, JavaScript, C++]
Array after adding Ruby at index 2: [Java, Python, Ruby, JavaScript, C++]
Array after removing element at index 3: [Java, Python, Ruby, C++]
Array after setting element at index 1 to C: [Java, C, Ruby, C++]
Element at index 2: Ruby
Index of Python: -1
Size of Array: 4
Java
C
Ruby
C++
*/