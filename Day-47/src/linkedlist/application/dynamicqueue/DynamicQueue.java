package linkedlist.application.dynamicqueue;

public class DynamicQueue {
    int size;
    private Node rear;
    private Node front;


    DynamicQueue(){
        rear=null;
        front=null;
        size=0;
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        if (front==null){
            front=newNode;

        }
        else {
            rear.setNext(newNode);
        }

        rear=newNode;
        size++;

    }

    public int dequeue(){
        if (front==null) {
            throw new DynamicQueueException("stack underflow");
        }

        int x=front.getData();
        front=front.getNext();
        if (front==null){
            rear=null;
        }
        size--;
        return x;
    }

    public int peek(){
        if (front==null) {
            throw new DynamicQueueException("stack underflow");
        }

        return front.getData();
    }

    public int getSize(){
        return size;
    }

}
