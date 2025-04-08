package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueues {

    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue<>(Collections.reverseOrder());
//        PriorityQueue pq=new PriorityQueue<>(); //minimum value by default
        pq.add(9);
        pq.add(2);
        pq.add(3);
        pq.add(1);
        pq.add(null);
        System.out.println(pq.poll());
    }
}
