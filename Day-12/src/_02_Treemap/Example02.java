package _02_Treemap;

import java.util.Map;
import java.util.TreeMap;

public class Example02 {
    public static void main(String[] args) {
        Map<String,Integer> cart = new TreeMap<>();
        cart.put("Dell",100000);
        cart.put("Mac",130000);
        cart.put("Lenovo",120000);

        System.out.println(cart.get("Dell"));
        System.out.println(cart.get("iphone"));

    }
}
