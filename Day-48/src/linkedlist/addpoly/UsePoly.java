package linkedlist.addpoly;

public class UsePoly {
    public static void main(String[] args) {
        Poly first=new Poly();
        first.append(2,1);
        first.append(5,3);
        first.append(3,4);
        first.append(9,6);

        Poly second=new Poly();
        second.append(10,2);
        second.append(4,3);
        second.append(2,4);
        second.append(5,6);
        second.append(3,7);

        first.display();
        second.display();

        Poly third = new Poly();
        third.addPoly(first,second);
        third.display();
    }
}
