package collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@FunctionalInterface
interface Msg {
    void msg(String studentName);
}

public class Java_8 {
    public static void main(String[] args) {
//        Msg msg = (studentName -> System.out.println("hi stupid " + studentName));
//        msg.msg("Ayu");
//        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
//        Map<Boolean, List<Integer>> evenNum = listOfIntegers.stream()
//                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
//        System.out.println("Even ->" + evenNum.get(true));
//        System.out.println("Odd ->" + evenNum.get(false));
//        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
//       List<String> distinct= listOfStrings.stream().distinct().collect(Collectors.toList());
//        String ans = "Ayushi Madam";
//      Map<String,Long>mp=  Arrays.stream(ans.split("")).collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
//        System.out.println(mp);
//    }
//        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
//        Map<String, Long> mp = stationeryList.stream().collect(Collectors.groupingBy(stationeryLists -> stationeryLists, Collectors.counting()));
//        System.out.println(mp);
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
       List<Integer> integerList= listOfIntegers.stream().filter(n->n%5==0).collect(Collectors.toList());
        System.out.println(integerList);
        //type of functional interface introduced -
        // predicate
        // consumer
        // function
        // supplier
        // bipredicate
        // biconsumer

    }
}
