package queue.QueueUsingTwoStack;

public class UseMyQueue {
    public static void main(String[] args) {
        MyQueue queue=new MyQueue();
        try {
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);
            System.out.println(queue.peek());
            System.out.println(queue.dequeue());
            System.out.println(queue.peek());
        }catch (MyQueueException ex){
            System.out.println(ex.getMessage());
        }
    }
}
