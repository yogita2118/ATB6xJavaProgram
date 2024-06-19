package june.ex_01062024;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab251 {
    public static void main(String[] args) {
        Queue pq1 = new PriorityQueue();
        pq1.add("B");
        pq1.add("A");
        pq1.add("C");
        pq1.add("C");
        pq1.offer("D");
        System.out.println(pq1.poll());
        System.out.println(pq1);
        System.out.println(pq1.peek());
    }
}
