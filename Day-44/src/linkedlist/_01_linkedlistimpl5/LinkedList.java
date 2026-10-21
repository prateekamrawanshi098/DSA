package linkedlist._01_linkedlistimpl5;

import java.util.Stack;

public class LinkedList {
    private Node head;


    public void append(int x) {
        if (head == null) {
            head = new Node(x);
            return;
        }
        Node newNode = new Node(x);
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
    }

    public void display() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + "->");
            temp = temp.getNext();
        }
        System.out.print("null");
    }

    public int countNodes() {
        if (head == null) {
            return 0;
        }
        int count = 1;
        Node temp = head;
        while (temp.getNext() != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    public void insertAt(int data, int pos) {
        int count = countNodes();
        if (count < 0 || pos > count) {
            throw new IllegalArgumentException();
        }
        Node newNode = new Node(data);
        if (pos == 0) {
            newNode.setNext(head);
            head = newNode;
            return;
        }
        int i = 0;
        Node temp = head;
        while (i < pos - 1) {
            temp = temp.getNext();
            System.out.println(1);
            i++;
        }
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);

    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        if (head.getData() > data) {
            newNode.setNext(head);
            head = newNode;
            return;
        }
        Node temp = head, prev = null;
        while (temp != null && temp.getData() < data) {
            prev = temp;
            temp = temp.getNext();
        }
        if (temp == null) {
            prev.setNext(newNode);
        } else {
            prev.setNext(newNode);
            newNode.setNext(temp);
        }
    }

    public int deleteFirstNode() {
        if (head == null) {
            throw new IllegalStateException("List is Empty");
        }

        int data = head.getData();
        head = head.getNext();
        return data;
    }

    public int deleteAtLast() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        if (head.getNext() == null) {
            int x = head.getData();
            head = null;
            return x;
        }

        Node temp = head;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        int x = temp.getNext().getData();
        temp.setNext(null);
        return x;
    }

    public boolean removeNode(int data) {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        if (head.getData() == data) {
            head = head.getNext();
            return true;
        }

        Node temp = head;
        while (temp.getNext() != null && temp.getNext().getData() != data) {
            temp = temp.getNext();
        }
        if (temp.getNext() == null) {
            return false;
        }
        temp.setNext(temp.getNext().getNext());
        return true;
    }

    public void printReverse() {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while (temp != null) {
            stack.push(temp.getData());
            temp = temp.getNext();
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + "->");
        }
        System.out.print("null");
    }


    public void reverseList() {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while (temp != null) {
            stack.push(temp.getData());
            temp = temp.getNext();
        }
        temp=head;
        while (temp != null) {
            temp.setData(stack.pop());
            temp = temp.getNext();
        }
    }

    public void reverseList_2(){
        Node curr=head , prev=null, next=null;

        while (curr!=null){
            next=curr.getNext();
            curr.setNext(prev);
            prev=curr;
            curr=next;
        }
        head=prev;
    }


    public boolean deleteFromLast(int pos){

        if (head==null ){
            throw new IllegalStateException("List is empty");
        }

        if (countNodes()<pos || pos<1){
            throw new IllegalArgumentException("invalid position");
        }

        if (countNodes()==pos){
            head=head.getNext();
            return true;
        }
        int jump=countNodes()-pos;
        int i=1;
        Node temp=head;
        while (i<jump) {
            temp = temp.getNext();
            i++;
        }
        if (temp.getNext()==null){
            return false;
        }

        temp.setNext(temp.getNext().getNext());
        return true;

    }
}