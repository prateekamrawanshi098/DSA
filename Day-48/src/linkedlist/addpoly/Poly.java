package linkedlist.addpoly;

public class Poly {
    private Node head;

    public Poly() {
        head = null;
    }

    public void append(int coeff,int exp){
        Node newNode= new Node(coeff,exp);
        if (head==null){
            head=newNode;
            return;
        }

        Node temp=head;
        while (temp.getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(newNode);
    }

    public void display(){
        if (head==null){
            System.out.println("List is Empty");
            return;
        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.getCoeff()+"x^"+temp.getExp()+"->");
            temp=temp.getNext();
        }
        System.out.print("null");
        System.out.println();
    }

    public void addPoly(Poly first,Poly second){

        if (first.head==null && second.head==null){
            System.out.println("addition is not possible");
            return;
        }
        Node temp=head;
        Node f=first.head;
        Node s=second.head;
        while (f!=null && s!=null){

            Node newNOde=new Node();

            if (head==null){
                head=newNOde;
            }
            else {
                temp.setNext(newNOde);
            }

            if (f.getExp()<s.getExp()){
                newNOde.setCoeff(f.getCoeff());
                newNOde.setExp(f.getExp());
                f=f.getNext();

            }


            else if (f.getExp()>s.getExp()){
                newNOde.setCoeff(s.getCoeff());
                newNOde.setExp(s.getExp());
                s=s.getNext();
            }

            else {
                int sum=f.getCoeff()+s.getCoeff();
                newNOde.setCoeff(sum);
                newNOde.setExp(f.getExp());
                f=f.getNext();
                s=s.getNext();
            }

            temp=newNOde;
        }

        Node q=null;
        if (f!=null){
            q=f;
        }
        else {
            q=s;
        }

        while (q!=null){


            Node newNode=new Node();
            if (head==null){
                head=newNode;
            }
            else {
                temp.setNext(newNode);
            }
            temp=newNode;
            newNode.setCoeff(q.getCoeff());
            newNode.setExp(q.getExp());
            q=q.getNext();
        }

    }

}
