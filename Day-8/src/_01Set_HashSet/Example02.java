package _01Set_HashSet;

import java.util.HashSet;
import java.util.Set;

public class Example02 {
    public static void main(String[] args) {
        Set<Integer> numList =new HashSet<>();
        System.out.println(numList.add(15));
        System.out.println(numList.add(15));
        System.out.println(numList.add(15));
        System.out.println(numList.add(4));
        System.out.println(numList.add(20));
        System.out.println(numList.add(19));
        System.out.println(numList);
    }
}
