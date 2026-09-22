package _01_Map_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Example01 {
    public static void main(String[] args) {
        Map<String,Integer> shoppingCart = new HashMap<>();

        System.out.println(shoppingCart.put("Dell",90000));
        System.out.println(shoppingCart.put("Lenovo",80000));
        System.out.println(shoppingCart.put("HP",70000));
        System.out.println(shoppingCart.put("Dell",100000));

        System.out.println(shoppingCart.get("Dell"));
        System.out.println(shoppingCart.get("Mac"));

        System.out.println(shoppingCart);

    }
}
