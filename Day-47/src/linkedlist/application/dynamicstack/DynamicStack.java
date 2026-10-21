package linkedlist.application.dynamicstack;

public class DynamicStack {
    int size;
    private Node tos;
    DynamicStack(){
        tos=null;
        size=0;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.setNext(tos);
        tos=newNode;
        size++;
    }

    public int pop(){
        if (tos==null) {
            throw new DynamicStackException("stack underflow");
        }

        int x=tos.getData();
        tos=tos.getNext();
        size--;
        return x;
    }

    public int peek(){
        if (tos==null) {
            throw new DynamicStackException("stack underflow");
        }

        return tos.getData();
    }

    public int getSize(){
        return size;
    }

}
