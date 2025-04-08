package org.example;

public class TraverseMatrix {
    public static void main(String[] args) {
        int[][] arr = {{2, 3}, {3, 6}};
        TraverseMatrixes(arr);
    }

    private static void TraverseMatrixes(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
