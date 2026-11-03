package graph.pq;

import java.util.PriorityQueue;

public class Example1 {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(7);
        pq.add(12);
        pq.add(3);
        pq.add(22);
        for (int i:pq){
            System.out.println(i);
        }
    }
}
