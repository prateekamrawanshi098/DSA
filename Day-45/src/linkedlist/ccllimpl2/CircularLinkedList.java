package linkedlist.ccllimpl2;

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


    public int deleteFirstNode(){
        if (head==null){
            throw new IllegalStateException("list is empty");
        }
        int x=head.getData();
        if (head.getNext()==head){

            head=null;
            return x;
        }
        Node temp=head;
        while (temp.getNext()!=head){
            temp=temp.getNext();
        }

        head=head.getNext();
        temp.setNext(head);
        return x;
    }

    public int deleteLastNode(){
        if (head==null) {
            throw new IllegalStateException("List is Empty");
        }

        if (head.getNext()==head){
            int x=head.getData();
            head=null;
            return x;
        }

        Node temp=head;
        while (temp.getNext().getNext()!=head){
            temp=temp.getNext();
        }
        int x=temp.getNext().getData();
        temp.setNext(head);
        return x;
    }

    public void deleteData(int data){
        if (head==null) {
            throw new IllegalStateException("List is Empty");
        }
        Node temp=head;
        if (head.getData()==data){
           if (head.getNext()==head){
               head=null;
               return;
           }


           while (temp.getNext()!=head){
               temp=temp.getNext();
           }
           head=head.getNext();
           temp.setNext(head);
           return;
       }

       Node prev=null;
       while (temp.getNext()!=head && temp.getData()!=data){
           prev=temp;
           temp=temp.getNext();
       }

       if (temp.getData()==data){
           prev.setNext(temp.getNext());
       }
       else {
           System.out.println("data not found");
       }
    }

}