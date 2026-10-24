package tree.bst.impl3;

import java.util.Stack;

public class BST {
    private Node root;

    public void append(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }

        Node temp = root;
        Node prev = null;
        while (temp != null) {
            prev = temp;
            if (data < temp.getData()) {
                temp = temp.getLeft();
            } else {
                temp = temp.getRight();
            }
        }
        if (data < prev.getData()) {
            prev.setLeft(newNode);
        } else {
            prev.setRight(newNode);
        }

    }


    public void append_2(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }

        Node temp = root;
        while (true) {
            if (data < temp.getData()) {
                if (temp.getLeft() == null) {
                    temp.setLeft(newNode);
                    return;
                }
                temp = temp.getLeft();
            } else {

                if (temp.getRight() == null) {
                    temp.setRight(newNode);
                    return;
                }
                temp = temp.getRight();
            }
        }

    }

    public void preorderTraversal() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        Node temp = root;
        Stack<Node> stack = new Stack<>();


        while (true) {
            System.out.println(temp.getData());

            if (temp.getRight()!=null){
                stack.push(temp.getRight());
            }

            temp=temp.getLeft();
            if (temp==null){
                if (stack.isEmpty()){
                    break;
                }
                temp=stack.pop();
            }
        }
    }

    public void inorderTraversal(){
        if (root==null){
            System.out.println("Tree is empty");
            return;
        }

        Stack <Node> stack= new Stack<>();
        Node temp=root;

        while (temp!=null || !stack.isEmpty()){

            while (temp!=null){
                stack.push(temp);
                temp=temp.getLeft();
            }

                temp=stack.pop();
                System.out.println(temp.getData());
                temp=temp.getRight();




        }
    }
}