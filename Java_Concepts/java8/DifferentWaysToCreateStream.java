package java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DifferentWaysToCreateStream {

    //from collection
    List<Integer> salaryList = Arrays.asList(3,5,1000,9000);
    Stream<Integer> stream=salaryList.stream();

    //from Array
    Integer[] salaryArray={1000,4000,2000};
    Stream<Integer> streamFromIntegerArray=Arrays.stream(salaryArray);

    //from Static method
    Stream<Integer> streamFromStaticMethod = Stream.of(1000,2000,90000);

    //from Stream Builder
//    Stream.Builder<Integer> streamBuilder=Stream.builder();
//    streamBuilder.add(100).add(900);
//    Stream<Integer> streamFromStreamBuilder=streamBuilder.build();
//
    //from Stream Iterate:
    Stream<Integer> streamFromIterate=Stream.iterate(2000,(Integer n)->n*6000).limit(2);
}

