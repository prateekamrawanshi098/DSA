public class ThreadedTree {

    private Node root;

    public void append(int data){

        Node newNode=new Node(data);

        if (root==null){
            root=newNode;
            System.out.println(data+" added successfully");
            return;
        }
        Node temp=root;
        while (true){
            if (data<temp.getData()){
                if (temp.getLeft()==null){
                    temp.setLeft(newNode);
                    newNode.setRight(temp);
                    System.out.println(data+" added successfully");
                    return;
                }
                temp=temp.getLeft();
            }
            else {
                if (temp.getThread()==1){
                    newNode.setRight(temp.getRight());
                    temp.setRight(newNode);
                    temp.setThread(0);
                    System.out.println(data+" added successfully");
                    return;
                }
                temp=temp.getRight();
            }
        }
    }

    public void inOrderOneWay(){
        if (root==null){
            System.out.println("tree is empty");
            return;
        }


        Node temp=extremeLeft(root);
        while (temp!=null){
            System.out.print(temp.getData()+"->");
            if (temp.getThread()==1){
                temp=temp.getRight();
            }
            else {
                temp=extremeLeft(temp.getRight());
            }
        }
        System.out.print("null");

    }

    private Node extremeLeft(Node temp) {
        if (temp==null){
            return null;
        }
        while (temp.getLeft()!=null){
            temp=temp.getLeft();
        }
        return temp;
    }
}
