package Revision.JavaConcepts.Collections;

import java.util.PriorityQueue;

public class PriorityQueueCollection {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(1);
        pq.add(2);
        pq.add(3);

        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());

    }
}
