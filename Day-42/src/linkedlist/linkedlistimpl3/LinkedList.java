package linkedlist.linkedlistimpl3;

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
        System.out.print("Number of nodes in list : ");
        return count;
    }

    public void insertAt(int data,int pos){
        int count=countNodes();
        if (count<0 || pos>count){
            throw new IllegalArgumentException();
        }
        Node newNode=new Node(data);
        if (pos==0){
            newNode.setNext(head);
            head=newNode;
            return;
        }
        int i=0;
        Node temp=head;
        while (i<pos-1){
            temp=temp.getNext();
            System.out.println(1);
            i++;
        }
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);

    }

    public void insert(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        if (head.getData()>data){
            newNode.setNext(head);
            head=newNode;
            return;
        }
        Node temp=head, prev=null;
        while (temp!=null && temp.getData()<data){
            prev=temp;
            temp=temp.getNext();
        }
        if (temp==null){
            prev.setNext(newNode);
        }
        else {
            prev.setNext(newNode);
            newNode.setNext(temp);
        }
    }

    public int deleteFirstNode(){
        if (head==null){
            throw new IllegalStateException("List is Empty");
        }

        int data=head.getData();
        head=head.getNext();
        return data;
    }
}
