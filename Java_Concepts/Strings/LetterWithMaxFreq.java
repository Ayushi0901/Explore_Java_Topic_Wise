package Strings;

import java.util.HashMap;
import java.util.Map;

public class LetterWithMaxFreq {
    public static void main(String[] args) {
        String s="AayushiiiiMadaaaammmmmmm";
        findMaxFrq(s);
    }

    private static void findMaxFrq(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i),0)+1);

        }
        int freq=Integer.MIN_VALUE;
        char c =' ' ;
        for(char mps: mp.keySet()){
            if(mp.get(mps)>freq){
                c=mps;
                freq=mp.get(mps);
            }
        }
        System.out.println(c);
    }
}
