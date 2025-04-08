package org.example;

public class Pallindrome {
    private static boolean isPallindrome(String st) {
        int s=0,e=st.length()-1;
        while(s<e){
            if(st.charAt(s)!=st.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public static void main(String[] args) {
        String st = "MwDwM";
        System.out.println(isPallindrome(st));
    }
}
