package Strings;

import java.util.HashMap;
import java.util.Map;

public class FirstOccCharcters {
    public static void main(String[] args) {
        String s = "aayushiiiiMadaaaammmmmmm";
        firstOccCharcters(s);
    }

    private static void firstOccCharcters(String s) {
        char nonRepeating = ' ';
        char repeating = ' ';
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mp.get(c) == 1) {
                nonRepeating = c;
                break;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mp.get(c) > 1) {
                repeating = c;
                break;
            }
        }
        System.out.println(repeating + " repeating");
        System.out.println(nonRepeating + " nonrepeating");
    }
}

