package Arrays;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumberElement {
    public static void main(String[] args) {
        int[] arr ={2,3,4,5,5,6,2,6};
        duplicateNumberElement(arr);
    }

    private static void duplicateNumberElement(int[] arr) {
        Map<Integer, Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        }
        for(int element:mp.keySet()){
            if(mp.get(element)>1){
                System.out.println(element + "  "+ mp.get(element));
            }
        }
    }
}
