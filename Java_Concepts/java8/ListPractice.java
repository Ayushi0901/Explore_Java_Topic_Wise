package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListPractice {
    public static void main(String[] args) {
        ArrayList<String> listWithDuplicateElements = new ArrayList<String>();
        listWithDuplicateElements.add("JAVA");

        listWithDuplicateElements.add("J2EE");

        listWithDuplicateElements.add("JSP");

        listWithDuplicateElements.add("SERVLETS");

        listWithDuplicateElements.add("JAVA");

        listWithDuplicateElements.add("STRUTS");

        listWithDuplicateElements.add("JSP");

//        HashMap<String,Integer> map= new HashMap<>();
//        for(String mp: listWithDuplicateElements){
//            map.put(mp, map.getOrDefault(mp,0)+1);
//
//        }
//        ArrayList<String> list=new ArrayList<>();
//        for(String mp: listWithDuplicateElements){
//            if(map.get(mp)==1) {
//                list.add(mp);
//            }
//        }
//        System.out.println(list);

//        List<String> duplicateElementRemoval= listWithDuplicateElements.stream().distinct().collect(Collectors.toList());
//        System.out.println(duplicateElementRemoval);
//        List<String> reverseList=new ArrayList<>();
        int s=0,e=listWithDuplicateElements.size()-1;
        while(s<e){
            String temp=listWithDuplicateElements.get(s);

            listWithDuplicateElements.set(s,listWithDuplicateElements.get(e));
            listWithDuplicateElements.set(e,temp);
            s++;
            e--;
        }
        System.out.println(listWithDuplicateElements);
    }
}
