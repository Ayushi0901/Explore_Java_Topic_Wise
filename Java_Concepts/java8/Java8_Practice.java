package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_Practice {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 6, 8, 10);
//        list.stream().filter(n -> n % 2 == 0).forEach(System.out::print);
//        boolean.mapToInt(Integer::intValue).sum();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.parallelStream().reduce(0, Integer::sum);
        System.out.println(sum);

        List<String> st= Arrays.asList("Ayushu","rio","shivi");
        list.stream().filter(n->n % 2==0).collect(Collectors.toList()).forEach(System.out::println);

    }
}
