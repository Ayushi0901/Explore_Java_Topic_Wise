package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AnagramTest {
    public static void main(String[] args) {
        String st = "ayushi";
        String st1 = "yuspahi";
        System.out.println(isAnagrams(st, st1));
    }

        static boolean isAnagrams(String s1, String s2){
            if (s1.length() != s2.length()) {
                return false;
            }
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            for (int i = 0; i < s2.length(); i++) {
                char ch = s2.charAt(i);
                if (map.containsKey(ch) == false) {
                    return false;
                } else {
                    if (map.get(ch) > 1) {
                        map.put(ch, map.get(ch) - 1);
                    } else {
                        map.remove(ch);
                    }
                }
            }

            if (map.size() > 0) {
                return false;
            } else {
                return true;
            }
        }
}
