package Collection_Framework;

/*
 * What is HashSet?

    A collection that does not allow duplicate elements.
    Does not maintain any specific order.
 */

import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        System.out.println("HashSet: " + hashSet);

        hashSet.add(3);
        System.out.println("HashSet after adding duplicate element 3: " + hashSet);
        hashSet.remove(2);                                                                                          // Not a index, it is element which is to be removed

        System.out.println("HashSet after removing element 2: " + hashSet);
        System.out.println("Size of HashSet: " + hashSet.size());
        System.out.println("Is HashSet empty? " + hashSet.isEmpty());
        System.out.println("Contains 3? " + hashSet.contains(3));
        System.out.println("Contains 6? " + hashSet.contains(6));

        for (Integer element : hashSet) {
            System.out.println(element);
        }
        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);
    }
}
