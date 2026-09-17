package _01Set_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example04 {
    public static void main(String[] args) {
        Set<Integer> numList =new HashSet<>();
        numList.add(15);
        numList.add(4);
        numList.add(20);
        numList.add(19);
        Iterator<Integer> it =  numList.iterator();
        while (it.hasNext()){
            int x=it.next();
            System.out.println(x);
        }
    }
}
