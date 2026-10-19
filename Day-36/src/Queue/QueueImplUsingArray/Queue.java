package Queue.QueueImplUsingArray;

public class Queue {
    int rear;
    int front;
    int [] arr;
    int size;

    public Queue(int size) {
        rear = -1;
        front = 0;
        this.size=size;
        arr = new int[size];
    }

    public void queue(int x){
        if (rear==size-1) {
            QueueException ex = new QueueException("Queue Overflow");
            throw ex;
        }
        arr[++rear]=x;
    }


    public int dequeue(){
        if (front>rear) {
            QueueException ex = new QueueException("Queue Underflow");
            throw ex;
        }
        return arr[front++];
    }


    public int peek(){
        if (front>rear) {
            QueueException ex = new QueueException("Queue Underflow");
            throw ex;
        }
        return arr[front];
    }
}
