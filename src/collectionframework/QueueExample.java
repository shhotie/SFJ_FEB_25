package collectionframework;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        for(Integer obj : pq){
            System.out.println(obj);
        }
        System.out.println(pq);
        // Remove element
        pq.remove(20);
//        pq.poll();
        System.out.println(pq);
    }
}
