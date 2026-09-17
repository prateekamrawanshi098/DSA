package _01Set_HashSet;

import java.util.HashSet;
import java.util.Set;

public class Example01 {
    public static void main(String[] args) {
        Set<String> months =new HashSet<>();
        months.add("Jan");
        months.add("Feb");
        months.add("Sep");
        months.add("Aug");
        System.out.println(months);
    }
}
