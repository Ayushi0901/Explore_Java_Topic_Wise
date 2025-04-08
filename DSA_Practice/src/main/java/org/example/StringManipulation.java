package org.example;

import java.util.HashMap;
import java.util.Map;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "aabcccd";
        //a2b1c3d1
        System.out.println(findFrequecy(str));
    }

    private static String findFrequecy(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        StringBuilder res = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            res.append(entry.getKey()).append(entry.getValue());
        }


        System.out.println(res);
        return " ";
    }
}
