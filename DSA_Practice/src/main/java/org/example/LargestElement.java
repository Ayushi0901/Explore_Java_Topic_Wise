package org.example;

public class LargestElement {
    static int largestElement(int[] arrs) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] > max) {
                max = arrs[i];
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {19, 3, 5, 33, 600, 7, 9};
        System.out.println(largestElement(arr));
    }
}
