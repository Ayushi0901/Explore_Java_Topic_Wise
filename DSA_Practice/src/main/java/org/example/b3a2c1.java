package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b3a2c1 {
    public static void main(String[] args) {
        String s = "aabbbc";

        Map<Character, Integer> mp = new HashMap<>();
        for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        List<Character> list = new ArrayList<>(mp.keySet());
        list.sort((a, b) -> mp.get(b) - mp.get(a));
        StringBuilder sbb = new StringBuilder();
        for (Character c : list) {
            sbb.append(c).append(mp.get(c));
        }

        System.out.println(sbb.toString());
    }
}



