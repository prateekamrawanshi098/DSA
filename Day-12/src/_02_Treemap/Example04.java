package _02_Treemap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Example04 {
    public static void main(String[] args) {
        Map<String,Integer> cart = new TreeMap<>();
        cart.put("Dell",100000);
        cart.put("Mac",130000);
        cart.put("Lenovo",120000);

        Collection<Integer> pprice= cart.values();
        System.out.println(pprice);
    }
}
