package queue.QueueUsingTwoStack;


import java.util.Stack;

public class MyQueue {

    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue(){
        s1=new Stack<>();
        s2=new Stack<>();
    }

    public void enqueue(int x){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int dequeue(){
        if (s1.isEmpty()){
            throw new MyQueueException("Queue underflow");
        }
        return s1.pop();
    }

    public int peek(){
        if (s1.isEmpty()){
            throw new MyQueueException("Queue underflow");
        }
        return s1.peek();
    }

}
