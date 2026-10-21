package linkedlist._02_cllimpl1;

import java.util.Stack;

public class CircularLinkedList {
    private Node head;

    CircularLinkedList(){
        head=null;
    }

    public void append(int data){
        Node newNode= new Node(data);

        if (head==null){
            head=newNode;
            newNode.setNext(head);
            return;
        }

        Node temp=head;
        while (temp.getNext()!=head){
            temp=temp.getNext();
        }
        temp.setNext(newNode);
        newNode.setNext(head);
    }

    public void displayList(){
        if (head==null){
            throw new IllegalStateException("List is empty");
        }

        Node temp=head;
        do {
            System.out.print(temp.getData()+"->");
            temp=temp.getNext();
        }while (temp!=head);

        System.out.print("null");
    }

    public void prepend(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            newNode.setNext(head);
            return;
        }

        newNode.setNext(head);
        Node temp=head;
        do{
            temp=temp.getNext();

        }while (temp.getNext()!=head);
        temp.setNext(newNode);
        head=newNode;
    }

}