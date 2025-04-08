package org.example;

import java8Practice.SingletonClass;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Singleton st= Singleton.getInstance();
        Singleton st2=Singleton.getInstance();
        SingletonClass sc=SingletonClass.getInstance();
        System.out.println(sc.hashCode());
        System.out.println(st.hashCode());
        System.out.println(st2.hashCode());
       //input -: 73
        //output :
        // 50 X 1
        // 20 x 1
        // 1 X 2
        //1 X1
        int amount =73;
        int[] notes={50,20,10,5,1};
        giveChange(amount,notes);
    }

    private static void giveChange(int amount, int[] notes) {
        Arrays.sort(notes);
        int noteCount=0;
        for(int i=notes.length-1;i>=0;i--){  // i =4
            if(amount>=notes[i]){ //73 >
                int numNotesLeft= amount/notes[i];
                noteCount+=numNotesLeft;
                System.out.println(notes[i]+"X"+numNotesLeft);
                amount%=notes[i];
            }
        }
    }
}