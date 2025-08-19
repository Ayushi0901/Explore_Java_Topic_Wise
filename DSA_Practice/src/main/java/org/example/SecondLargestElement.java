package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {777, 6, 88, 1};
        int n = findSecondElement(arr);
        System.out.println(n);
    }

    private static int findSecondElement(int[] arr) {
//        {5} , {6,7,1} //6
//        if(arr.length<2){
//            return -1;
//
//        }
//        PriorityQueue <Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
//        pq.add(10);
//        pq.add(88);
//        pq.add(7);
//        System.out.println(pq.poll());
//
//        int first= Integer.MIN_VALUE; //7,8,10
//        int second=Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>first){ //7 //
//                second=first; //s=min
//                first=arr[i];//l=7
//            }
//            else {
//                second=Math.max(second,arr[i]);  //s= (m,6) s=6
//            }
//        }
//        return second;
//    }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;

            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }
}
