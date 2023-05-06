package Java_collections_Framework;

import java.util.ArrayDeque;
import java.util.Queue;

public class J05_ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(4);
        dq.offerFirst(45);
        dq.offerLast(56);
        dq.offerFirst(8);
        System.out.println(dq);

        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());

        System.out.println(dq);
        System.out.println(dq.peekLast());
        System.out.println(dq.peekFirst());
    }
}
