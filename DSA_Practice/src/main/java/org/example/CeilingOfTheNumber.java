package org.example;

public class CeilingOfTheNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8};
        int tar = 4;
        System.out.println(ceilingNum(arr, tar));
        System.out.println(flooringNum(arr,tar));
    }

    private static int flooringNum(int[] arr, int tar) { //{2, 4, 8} //5
        int s=0,e=arr.length-1;
        int res=0;
        while (s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid]<=tar){
                res=arr[mid];
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }
        return res;
    }









    private static int ceilingNum(int[] arr, int tar) {
        int s=0,e=arr.length-1;
        int res=0;
        while (s<=e){
            int m=s+(e-s)/2;
            if(arr[m]>=tar){
                res=arr[m];
                e=m-1;
            }
            else {
                s=m+1;
            }
        }
        return res;

    }
}