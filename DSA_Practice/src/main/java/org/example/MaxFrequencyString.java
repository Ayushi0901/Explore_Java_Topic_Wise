package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxFrequencyString {
    public static void main(String[] args) {
        String s = "aabbbc";
        //3b2a1c
        findFrequency(s);
    }

    private static void findFrequency(String s) {

        Map<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        map.entrySet().stream().sorted((e1,e2)->e2.getValue()-e1.getValue()).
                forEach(e-> System.out.print(e.getKey()+""+e.getValue()));

    }
}

