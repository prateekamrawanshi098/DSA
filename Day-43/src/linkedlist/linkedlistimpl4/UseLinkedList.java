package linkedlist.linkedlistimpl4;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(2);
        list.insert(3);
        list.insert(1);
        list.display();
        System.out.println();
        list.reverseList_2();
        list.display();
    }

}
