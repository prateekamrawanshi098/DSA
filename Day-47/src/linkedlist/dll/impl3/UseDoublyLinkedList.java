package linkedlist.dll.impl3;

public class UseDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.prepend(20);
        list.prepend(10);
        list.append(30);
        list.append(40);
        list.deleteNode(20);

        list.displayList();
    }
}
