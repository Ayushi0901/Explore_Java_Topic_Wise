package org.example;

public class Reverse2Dmatrix {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 4},
                {7, 8, 9},
                {5, 7, 2}};
        //{{5,7,2},
        // {7,8,9},
        // {2,3,4}}
//        row2DMatrix(arr);
        col2DMatrix(arr);
//        findTarget(arr,7);


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    private static void col2DMatrix(int[][] arr) {
        for(int i=0;i< arr[0].length;i++){
            int s=0,e= arr.length-1;
            while (s<e){
                int temp=arr[s][i];
                arr[s][i]=arr[e][i];
                arr[e][i]=temp;
                s++;
                e--;
            }
        }
    }
    private static boolean findTarget(int[][] arr, int tar){
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==tar && found==false){
                    found=true;
                    System.out.println("i="+i+" "+"j="+j);
                }
            }
        }
        return found;
    }


    private static void row2DMatrix(int[][] arr) {

        for(int i =0;i<arr.length;i++){
            int s=0,e= arr.length-1;
            while(s<e){
                int temp= arr[i][e];
                arr[i][e]=arr[i][s];
                arr[i][s]=temp;
                s++;
                e--;
            }
        }
    }
}