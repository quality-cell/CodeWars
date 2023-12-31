package org.example.kyu6;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersInYourString {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (Character i: str.toCharArray()) {
            if (map.containsKey(i)) {
                int j = map.get(i) + 1;
                map.put(i, j);
                continue;
            }

            map.put(i, 1);
        }

        return map;
    }
}
