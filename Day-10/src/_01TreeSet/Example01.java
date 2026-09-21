package _01TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class Example01 {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();
        ts.add(19);
        ts.add(34);
        ts.add(2);
        ts.add(56);
        ts.add(6);
        ts.add(21);
        for (Integer x: ts){
            System.out.println(x);
        }
    }
}
