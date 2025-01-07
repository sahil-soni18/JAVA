package Collection_Framework;

import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        // Creating an empty list
        var list = new java.util.ArrayList<Integer>();

        // Adding elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Printing the list
        System.out.println("List: " + list);

        // Reversing the list
        Collections.reverse(list);
        System.out.println("List after reversing: " + list);

        // Shuffling the list
        Collections.shuffle(list);
        System.out.println("List after shuffling: " + list);

        // Sorting the list
        Collections.sort(list);
        System.out.println("List after sorting: " + list);

        // Swapping elements at index 1 and 3
        Collections.swap(list, 1, 3);
        System.out.println("List after swapping elements at index 1 and 3: " + list);

        // Rotating the list by 2 positions to the right
        Collections.rotate(list, 2);
        System.out.println("List after rotating by 2 positions to the right: " + list);

        // Filling the list with 0
        Collections.fill(list, 0);
        System.out.println("List after filling with 0: " + list);

        // Finding the frequency of 0
        System.out.println("Frequency of 0: " + Collections.frequency(list, 0));

        // Finding the maximum element
        System.out.println("Maximum element: " + Collections.max(list));

        // Finding the minimum element
        System.out.println("Minimum element: " + Collections.min(list));

        // Creating an empty list
        var list2 = new java.util.ArrayList<Integer>();

        // Adding elements to the list
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        // Checking if two lists are different
        System.out.println("Are both lists different? " + Collections.disjoint(list, list2));
    }
}
