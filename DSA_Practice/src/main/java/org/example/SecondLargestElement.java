package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr={7,6,1};
        int n= findSecondElement(arr);
        System.out.println(n);
    }

    private static int findSecondElement(int[] arr) {
//        {5} , {6,7,1} //6
        if(arr.length<2){
            return -1;

        }
        PriorityQueue <Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(9);
        pq.add(7);
        System.out.println(pq.poll());

        int largest= Integer.MIN_VALUE; //7,6,1
        int smallest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){ //7 //
                smallest=largest; //s=min
                largest=arr[i];//l=7
            }
            else {
                smallest=Math.max(smallest,arr[i]);  //s= (m,6) s=6
            }
        }
        return smallest;
    }
}
