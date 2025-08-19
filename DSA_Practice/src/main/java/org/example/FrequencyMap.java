package org.example;

import java.util.HashMap;
import java.util.Map;

public class FrequencyMap {
    public static void main(String[] args) {
        String s="Ayushi";

        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for (char c: mp.keySet()){
            System.out.println(c+""+mp.get(c));
        }
        System.out.println(mp); 
    }
















//    static  Map<Character,Integer> frequencyMap(String st){
//        HashMap<Character, Integer> mp = new HashMap<>();
//        for(int i =0;i<st.length();i++){
//            mp.put(st.charAt(i),mp.getOrDefault(st.charAt(i),0)+1);
//        }
//        return mp;
//    }
//
//    public static void main(String[] args) {
//        String st= "MADAM";
//        Map<Character,Integer> mp= frequencyMap(st);
//        for(char ch:mp.keySet() ){
//            System.out.println(ch+""+ mp.get(ch)+" ");
//        }
//
//    }
}
