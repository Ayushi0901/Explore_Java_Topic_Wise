package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonCharBtwStr {
    public static void main(String[] args) {
        String st1 = "thin sticks";
        String st2 = "thick bricks";
        CommonCharacterBtwStr(st1, st2); //thisick //chiikst

    }

    private static void CommonCharacterBtwStr(String st1, String st2) {
        Map<Character, Integer> mp1 = new HashMap<>();
        Map<Character, Integer> mp2 = new HashMap<>();
        for (int i = 0; i < st1.length(); i++) {
            mp1.put(st1.charAt(i), mp1.getOrDefault(st1.charAt(i), 0) + 1);
        }
        for (int j = 0; j < st2.length(); j++) {
            mp2.put(st2.charAt(j), mp2.getOrDefault(st2.charAt(j), 0) + 1);
        }
        List<Character> commonChar = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : mp1.entrySet()) {
            if (mp2.containsKey(entry.getKey())) {
                commonChar.add(entry.getKey());
            }
        }
//        Collections.sort(commonChar);
for(char c='a';c<'z';c++){
    if (mp1.containsKey(c) && mp2.containsKey(c)) {
        System.out.print(c); // only print once
    }
}
//        for (char ch : commonChar) {
//            System.out.println(ch);
//        }
    }

}
