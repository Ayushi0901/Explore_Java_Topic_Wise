package org.example;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {6, 8, 9, 11, 17};
        int tar = 10;

        System.out.println(findBinaryNum(arr, tar));
    }

    private static int findBinaryNum(int[] arr, int tar) {
        int r = arr.length - 1, l = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (tar == arr[mid]) {
                return mid;
            } else if (tar > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}