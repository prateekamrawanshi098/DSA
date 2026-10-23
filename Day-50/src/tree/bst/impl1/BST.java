package tree.bst.impl1;

public class BST {
    private Node root;

   public void append(int data){
       Node newNode=new Node(data);
       if (root==null){
           root=newNode;
           return;
       }

       Node temp=root;
       Node prev=null;
       while(temp!=null){
           prev=temp;
           if (data<temp.getData()){
               temp=temp.getLeft();
           }
           else {
               temp=temp.getRight();
           }
       }
       if (data<prev.getData()){
           prev.setLeft(newNode);
       }
       else {
           prev.setRight(newNode);
       }

   }


    public void append_2(int data){
        Node newNode=new Node(data);
        if (root==null){
            root=newNode;
            return;
        }

        Node temp=root;
        while(true){
            if (data<temp.getData()){
                if (temp.getLeft()==null){
                    temp.setLeft(newNode);
                    return;
                }
                temp=temp.getLeft();
            }
            else {

                if (temp.getRight()==null){
                    temp.setRight(newNode);
                    return;
                }
                temp=temp.getRight();
            }
        }

    }
}
