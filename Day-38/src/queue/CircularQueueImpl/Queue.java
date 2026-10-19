package queue.CircularQueueImpl;

public class Queue {
    int front,rear,size;
    int [] arr;

    public Queue( int size) {
        this.front = -1;
        this.rear = -1;
        this.size = size;
        this.arr = new int[size];
    }

    public void enqueue(int x)  {
        if ((rear==size-1 && front==0) || (rear+1==front)){
            throw new QueueException("Queue overflow");
        }

        if (rear==size-1){
            rear=0;
            arr[rear]=x;
        }

        else arr[++rear]=x;

        if (front==-1){
            front=0;
        }

    }

    public int dequeue(){

        if (front==-1){
            throw new QueueException("queue underflow");
        }

        int x=arr[front];

        if (front==rear){
            front=rear=-1;
        }

        else if (front==size-1){
            front=0;
        }
        else{
             front++;
        }
        return x;
    }

    public int peek(){
        if (front==-1){
            throw new QueueException("queue underflow");
        }
        return arr[front];
    }
}
