package java8Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Prac {
    public static void main(String[] args) {
        List<Integer> listOfInt = List.of(1,2, 3, 4, 5,8,7,5,4,3);
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        String st= "Ayushi the great";
        String s1 = "RaceCar";
        String s2 = "CarRacef";
        //Seperate Odd and even number
        Map<Boolean, List<Integer>> res =  listOfInt.stream().collect(Collectors.partitioningBy(i->i%2==0));
        System.out.println("Even num->"+res.get(true));
        System.out.println("Odd num->"+res.get(false));

        //rEmove deplicate element from list
        System.out.println(listOfInt.stream().distinct().collect(Collectors.toList()));

        //frequency of each element in an array
        System.out.println(listOfInt.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
        //Sort the list in reverse order
        System.out.println(  listOfInt.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        //Maximum and mini in a list
        System.out.println(listOfInt.stream().max(Comparator.naturalOrder()).get());
        System.out.println(listOfInt.stream().min(Comparator.naturalOrder()).get());

        //print multiple of 2
        System.out.println(listOfInt.stream().filter(i->i%2==0).collect(Collectors.toList()));

        //Reverse earch word in a string
        System.out.println(Arrays.stream(st.split(" ")).map(word->new StringBuffer(word).reverse()).collect(Collectors.joining(" ")));

        //ANagram comparison
        String st1= Arrays.stream(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String st2= Arrays.stream(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if(st1.equals(st2)){
            System.out.println("string is anaragram");
        }
        else{
            System.out.println("string is not anaragram");
        }
        //find the second largest element
        System.out.println(listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

        //Find all integers start with integer
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
     listOfStrings.stream().filter(str->Character.isDigit(str.charAt(0))).forEach(System.out::println);

     //find the last elemet of the array
        System.out.println(listOfIntegers.stream().skip(listOfIntegers.size()-1).findFirst().get());

     //Anagram
        String str1 = "RaceCar";
        String str2 = "CarRace";
       str1= Arrays.stream(str1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
       str2=Arrays.stream(str2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());


        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);


//        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
//
//        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
//        common elements between two arrays
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        //21,56
        list1.stream().filter(list2::contains).forEach(System.out::println);



    }


}
