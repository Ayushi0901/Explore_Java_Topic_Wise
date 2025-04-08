package org.example;

public class CeilingOfTheNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8};
        int tar = 7;
        System.out.println(ceilingNum(arr, tar));
        System.out.println(flooringNum(arr,tar));
    }

    private static int flooringNum(int[] arr, int tar) { //{2, 4, 8} //5
        int start=0,end=arr.length-1;//s=0,e=2 s=0,e=0
        int res=0;
        while(start<=end){ //t
            int mid=start+(end-start)/2; // mid = 1
            if(arr[mid]<=tar){//4<=2
                res=arr[mid];
                start=mid+1;

            }
            else{
                end=mid-1; //e=0
            }
        }
        return res;
    }






















    private static int ceilingNum(int[] arr, int tar) {
        int start = 0, end = arr.length - 1;
        int res = 0;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= tar) {
                res = arr[mid];
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return res;
    }









}