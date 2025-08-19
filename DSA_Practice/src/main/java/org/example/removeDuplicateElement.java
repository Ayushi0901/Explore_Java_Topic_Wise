package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class removeDuplicateElement {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(65);
        removeDuplicate(list);
    }

    private static void removeDuplicate(List<Integer> list) {

//        // with O(n) approach using set
//        Set<Integer> setWithoutDuplicate= new HashSet<>(list);
//        List<Integer> listWithoutDuplicates=new ArrayList<>(setWithoutDuplicate);
//        System.out.println(listWithoutDuplicates);
//    }}

//        //without set with O(n^2)
//        List<Integer> listWithoutDuplicate = new ArrayList<>();
//        for (Integer num : list) {
//            if (!listWithoutDuplicate.contains(num)) {
//                listWithoutDuplicate.add(num);
//            }
//        }
//        System.out.println(list);
//        System.out.println(listWithoutDuplicate);
//    }}

        //with Map O(n)
        List<Integer> listWithoutDuplicates = new ArrayList<>();
        Map<Integer, Boolean> seen = new HashMap<>();
        for (Integer num : list) {
            if (!seen.containsKey(num)) {
                listWithoutDuplicates.add(num);
                seen.put(num, true);
            }
        }
        System.out.println(listWithoutDuplicates);
    }
}

//with iterator O[n]
//        Map<Integer, Integer> mp = new HashMap<>();
//        Iterator<Integer> it= list.iterator();
//        while(it.hasNext()){
//            int i = it.next();
//            if(i==2) {
//                list.remove(i);
//            }
//            System.out.println(i);
//        }
//        for (int num : list) {
//            if (mp.containsKey(num)) {
//                continue;
//            } else {
//                mp.put(num, mp.getOrDefault(num, 0) + 1);
//                System.out.println(num);
//            }
//        }
//    }
//}
