package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Iterable {
    /*
    Key Concepts
Iterable Interface: The Iterable interface provides a method called iterator() that returns an Iterator object. This Iterator allows you to traverse the elements of the collection one by one.
Iterator Interface: The Iterator interface provides two primary methods:
hasNext(): Returns true if there are more elements to iterate over.
next(): Returns the next element in the iteration.
remove(): Removes the last element returned by iterator
Enhanced for-loop: Java provides a more concise way to iterate over collections using the enhanced for loop, which works for any collection that implements Iterable.
     */

//     //Iterating over a list
//    public  static void main(String args[]){
//        List<Integer> list= new ArrayList<>(); //common lines in all the iterable implementATION
//        list.add(1);    //common lines in all the iterable implementATION
//        list.add(4);
//        list.add(9);
//        Iterator<Integer> it= list.iterator();//common lines in all the iterable implementATION
//        //Implementing USing Iterator
//        while(it.hasNext()){                 //common lines in all the iterable implementATION
//            System.out.println("Iterator- "+it.next());   //common lines in all the iterable implementATION
//        }
//        //enchanced for loop
//        for(int num:list){
//           System.out.println("Enchanced for loop- "+num);
//        }
//
//    }

    //Iterating over a set
    public  static void main(String args[]) {
        Set<String> s = new HashSet<>();
        s.add("Ayushi");
        s.add("ROhan");
        s.add("Ritik");
        Iterator<String> i=s.iterator();
        while(i.hasNext()){
            System.out.println("print name"+i.next());

        }
        for(String names:s){
            System.out.println(names);
        }
    }

//    //foreach java 8
//    public static void main(String[] args) {
//        List<Integer> it = Arrays.asList(1,9,3,5);
//        it.forEach(its-> System.out.println(its));
//    }
//
//    //Iterating over a map
// public static  void main(String[] args){
//     Map<String, Integer> mp= new HashMap<>();
//     mp.put("Ayushi",5);
//     mp.put("Rohan",3);
//     mp.forEach((key,value)-> System.out.println(key+":"+value*3));
// }
//
//
//    public static void main(String[] args) {
//        ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Cherry");
//        fruits.add("Date");
//        Iterator<String> it = fruits.iterator();
//        while (it.hasNext()) {
//            if (it.next().equals("Apple")) {
//                it.remove();
//            }
//        }
//        System.out.println(fruits);
//    }

}

