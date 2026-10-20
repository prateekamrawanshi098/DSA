package linkedlist.linkedlistImpl1;
/*
Violates encapsulation: data and next are default-access fields, so they are directly accessible within the package.



Not dynamic: Nodes are created manually instead of being managed through insertion and deletion methods.



No reusability: The code is written inside main(), so linked-list operations cannot be easily reused.



No proper abstraction: There is no separate LinkedList class to manage the nodes and operations.



Difficult to maintain: Every time you want to add or remove a node, you must manually update the links.



No built-in operations: Methods like insert(), delete(), search(), and display() are missing.



Poor data protection: Fields can be modified directly without validation.



No proper separation of responsibilities: The Node class contains the main() method and also handles list creation and traversal.
*/


public class Node {
    int data;
    Node next;

    public static void main(String[] args) {
        Node head;
        head=new Node();
        head.data=10;

        Node sec=new Node();
        sec.data=20;
        head.next=sec;

        Node third=new Node();
        third.data=30;
        sec.next=third;

        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
}
