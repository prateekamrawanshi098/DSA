package linkedlist.linkedlistImpl2;

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
            System.out.println("List is empty");
            return 0;
        }
        int count = 1;
        Node temp = head;
        while (temp.getNext() != null) {
            count++;
            temp = temp.getNext();
        }
        System.out.print("Number of nodes in list : ");
        return count;
    }

    public int searchNode(int data) {
        if (head == null) {
            return 0;
        }
        Node temp = head;
        int pos = 0;
        while (temp != null) {
            pos++;
            if (temp.getData() == data) {
                return pos;
            }
            temp = temp.getNext();
        }
        return -1;
    }

    public void prepend(int x) {
        Node newNode = new Node(x);
        newNode.setNext(head);
        head = newNode;
    }


}