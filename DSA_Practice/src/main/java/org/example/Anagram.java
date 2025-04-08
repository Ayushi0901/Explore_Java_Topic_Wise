package org.example;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {
        String str1 = "rishi";
        String str2 = "irih";
        System.out.println(isAnagram(str1, str2));
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        Map<Character, Integer> mp2 = new HashMap<>();
        for (int i = 0; i < str2.length(); i++) {
            char ch2 = str2.charAt(i);
            mp2.put(ch2, mp2.getOrDefault(ch2, 0) + 1);
        }

        return mp.equals(mp2);


    }
}