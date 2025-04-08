package org.example;

public class LargestElement {
    static int largestElement(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {19, 3, 5, 33, 600, 7, 9};
        System.out.println(largestElement(arr));
    }
}
