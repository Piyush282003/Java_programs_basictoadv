package Java_collections_Framework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class J04_Priority_Queue {
    public static void main(String[] args) {
//        minheap
        Queue<Integer> pq=new PriorityQueue<>();
        pq.offer(4);
        pq.offer(9);
        pq.offer(2);
        pq.offer(25);
        System.out.println("Minheap "+pq);

        pq.poll();
        System.out.println(pq);

//        ***************************************************************************************************************************************
//        maxheap
        Queue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq1.offer(4);
        pq1.offer(9);
        pq1.offer(2);
        pq1.offer(25);
        System.out.println("Maxheap "+pq1);

        pq1.poll();
        System.out.println(pq1);
    }
}
