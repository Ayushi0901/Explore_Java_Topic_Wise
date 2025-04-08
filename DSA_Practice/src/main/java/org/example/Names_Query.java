package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Names_Query {

    public static void main(String[] args) {
        List<String> list1 = List.of("Jackson", "Jackiee", "Jemmy", "Madam", "Jenny", "Jester");
        List<String> list2 = List.of("Jack", "Je");
        List<Integer> res = new ArrayList<>();
        for (String l2 : list2) {
            int count = 0;
            for (String l1 : list1) {
                if (l1.startsWith(l2) && l2.length() < l1.length()) {
                    count++;
                }
            }
            res.add(count);

        }
        System.out.println(res);
    }
}

