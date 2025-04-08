package collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        pq.add(80);
        pq.add(10);
        pq.add(20);


        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
