package org.example;

public class MergeTwoSortedArr {
    public static void main(String[] args) {
        int[] arr1={2,4,6,8};
        int[] arr2={3,5,7};
        int[] result=mergeTwoSortedArr(arr1,arr2);
        for(int i=0;i<result.length;i++) {
            System.out.println(result[i]);
        }
    }

    private static int[] mergeTwoSortedArr(int[] arr1, int[] arr2) {
        int i=0,j=0,k=0;
        int n1=arr1.length;
        int n2=arr2.length;
        int[] res= new int [n1+n2];
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                res[k++]=arr1[i++];
            }else {
                res[k++]=arr2[j++];
            }
        }
        if(n1<n2){
            res[k++]=arr2[j++];

        }
        else {
            res[k++]=arr1[i++];
        }
        return res;
    }
}