package linkedlist._02_cllimpl1;

public class UseCircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();


        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        list.prepend(50);
        list.displayList();
        System.out.println();

    }
}
