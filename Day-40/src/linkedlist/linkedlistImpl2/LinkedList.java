package linkedlist.linkedlistImpl2;

public class LinkedList {
    private Node head;


    public void append(int x){
        if(head==null){
            head=new Node(x);
            return;
        }
        Node newNode=new Node(x);
        Node temp=head;
        while (temp.getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(newNode);
    }

    public void display(){
        Node temp=head;
        while (temp.getNext()!=null){
            System.out.print(temp.getData()+"->");
            temp=temp.getNext();
        }
        System.out.print("null");
    }
}
