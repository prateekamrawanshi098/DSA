package linkedlist.dllimpl2;

public class DoublyLinkedList {
    private Node head;

    DoublyLinkedList() {
        head = null;
    }

    public void append(int data) {
        Node newNode=new Node(data);

        if (head==null){
            head=newNode;
            return;
        }

        Node temp=head;

        while (temp.getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(newNode);
        newNode.setPrev(temp);
    }

    public void displayList() {
        if (head==null){
            System.out.println("List is Empty");
            return;
        }

        Node temp=head;
        Node prev=null;
        System.out.println("In forward direction");
        while ( (temp!=null)){
            System.out.print(temp.getData()+"->");
            prev=temp;
            temp=temp.getNext();
        }

        System.out.print("null");
        System.out.println();
        System.out.println("In backward direction");
        while (prev!=null){
            System.out.print(prev.getData()+"->");
            prev=prev.getPrev();
        }
        System.out.print("null");

    }

    public void prepend(int data){
        Node newNode=new Node(data);

        if (head==null){
            head=newNode;
            return;
        }

        head.setPrev(newNode);
        newNode.setNext(head);
        head=newNode;

    }


    public  void deleteLast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp=head,prev=null;

        if (head.getNext()==null){
            head=null;
            return;
        }

        while (temp.getNext()!=null){
            prev=temp;
            temp=temp.getNext();
        }

        prev.setNext(null);

    }

    public void deleteFirst(){
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        head=head.getNext();

        if (head!=null){
            head.setPrev(null);
        }
    }

    public void deleteNode(int data){
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head.getData()==data){

            head=head.getNext();

            if (head!=null){
                head.setPrev(null);
            }
            return;
        }

        Node temp=head;
        while (temp!=null && temp.getData()!=data){
            temp=temp.getNext();
        }

        if (temp==null){
            System.out.println("data not found");
            return;
        }

        if (temp.getNext()==null){
            temp.getPrev().setNext(null);
        }
        else {

            temp.getPrev().setNext(temp.getNext());
            temp.getNext().setPrev(temp.getPrev());
        }
    }

}

