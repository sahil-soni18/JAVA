package Collection_Framework;

/*
 * What is HashMap?

    Stores data in key-value pairs.
    Keys must be unique, values can be duplicated.
 */

import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);
        hashMap.put("Five", 5);
        System.out.println("HashMap: " + hashMap);

        hashMap.put("Three", 33);
        System.out.println("HashMap after adding duplicate key Three: " + hashMap);
        hashMap.remove("Two");
        System.out.println("HashMap after removing key Two: " + hashMap);
        System.out.println("Size of HashMap: " + hashMap.size());
        System.out.println("Is HashMap empty? " + hashMap.isEmpty());
        System.out.println("Contains key Three? " + hashMap.containsKey("Three"));
        System.out.println("Contains value 6? " + hashMap.containsValue(6));
        System.out.println("Value for key Three: " + hashMap.get("Three"));

        // Iterate over HashMap usingentrySet()
        for (HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Iterate over HashMap using keySet()
        for (String key : hashMap.keySet()) {
            System.out.println(key + " : " + hashMap.get(key));
        }

        // Iterate over HashMap using values()
        for (Integer value : hashMap.values()) {
            System.out.println(value);
        }

        // Clearing HashMap
        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);
    }
}
