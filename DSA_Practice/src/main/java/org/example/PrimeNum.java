package org.example;

public class PrimeNum {
    public static void main(String[] args) {
        int n = 15;
        primeNumber(n);
    }

    private static void primeNumber(int n) {
        int count = 0;

        for (int i = 2; i <= n; i++) {
            count = 0;
            for (int j = 1; j<=i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }

    }
}
