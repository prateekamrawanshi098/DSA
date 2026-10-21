package linkedlist.dllimpl1;

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

        Node temp=head,  prev=null;

        while (temp.getNext()!=null){
            prev=temp;
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
        do{
            System.out.print(temp.getData()+"->");
            temp=temp.getNext();
        }while (temp!=null);

        System.out.print("null");
    }



}

