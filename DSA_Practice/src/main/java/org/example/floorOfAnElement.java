package org.example;

public class floorOfAnElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7};
        int tar = 5;
        System.out.println(isfloorOfAnElement(arr, tar));
    }

    private static int isfloorOfAnElement(int[] arr, int tar) {
        int s = 0, e = arr.length - 1;
        int res = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] <= tar) {
                res = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return arr[res];
    }


}