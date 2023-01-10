package treeMap;

import java.util.*;

public class TreeMapStringDemo {

    public static void main(String[] args) {

        // Set text in a string
        String text = "Buna dimineata. Sa aveti ore cu folos. " + "Vizita placuta!. Distrati-va!";

        // Create a TreeMap to hold words as key and count as value
        Map<String, Integer> map = new TreeMap<>();
        String[] words = text.split("[ \n\t\r.,;:!?(){}]");
        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();

            if (key.length() > 0) {
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                } else {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }

        // Get all entries into a set
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        // Get key and value from each entry
        for (Map.Entry<String, Integer> entry : entrySet)
            System.out.println(entry.getKey() + "\t" + entry.getValue());
    }
}

