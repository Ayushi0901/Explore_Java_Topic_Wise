package org.example;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={6,8,9,11,17};
        int tar=3;

        System.out.println(findBinaryNum(arr,tar));
    }

    private static int findBinaryNum(int[] arr, int tar) {
        int left=0,right=arr.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==tar){
               return mid;
            }
            else if(arr[mid]<tar){
                left=mid+1;
            }
            else {
                right=mid-1;
            }

        }
        return -1;
    }
}