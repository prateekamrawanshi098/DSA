package _01Set_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example05 {
    public static void main(String[] args) {
        Set<Integer> numList =new HashSet<>();
        numList.add(15);
        numList.add(8);
        numList.add(4);
        numList.add(20);
        numList.add(19);
        numList.add(23);
        Iterator<Integer> it =  numList.iterator();
        while (it.hasNext()){
            int x=it.next();
            if (x%2==0){
                it.remove();
            }
            else
                System.out.println(x);
        }
        System.out.println("Final size of numList : "+numList.size());
    }
}
