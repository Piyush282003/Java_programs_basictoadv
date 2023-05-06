package Java_collections_Framework;

import java.util.LinkedList;
import java.util.Queue;

public class J03_Queue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println(q);

        System.out.println(q.peek());
        q.poll();
        System.out.println(q.poll());
        System.out.println(q);
        q.clear();

        System.out.println(q.poll());
//        System.out.println(q.remove());                     //->NoSuchElementException
    }
}
