package org.example;

import java.util.Arrays;

public class lowesInterview {
    public static void main(String[] args) {
     String[]   nums = {"1", "2",  "Hello"};
    int sum= Arrays.stream(nums).filter(s->s.matches("\\d+")).mapToInt(Integer::parseInt).sum();

        System.out.println(sum);
    }
}
