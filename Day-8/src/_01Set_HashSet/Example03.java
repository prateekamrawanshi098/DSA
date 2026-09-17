package _01Set_HashSet;

import java.util.HashSet;
import java.util.Set;

public class Example03 {
    public static void main(String[] args) {
        Set<String> months =new HashSet<>();
        months.add("Jan");
        months.add("Feb");
        months.add("Sep");
        months.add("Aug");
        for (String s: months){
            System.out.println(s);
        }
    }
}
