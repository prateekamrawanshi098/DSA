package linkedlist.application.dynamicqueue;

public class UseDynamicQueue {
    public static void main(String[] args) {
        DynamicQueue queue=new DynamicQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
    }

}
