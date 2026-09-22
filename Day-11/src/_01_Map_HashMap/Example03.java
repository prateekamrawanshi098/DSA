package _01_Map_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Example03 {
    public static void main(String[] args) {
        Map<String,Integer> shoppingCart = new HashMap<>();

        shoppingCart.put("Dell",90000);
        shoppingCart.put("Lenovo",80000);
        shoppingCart.put("HP",70000);

        System.out.println(shoppingCart.containsKey("Dell"));
        System.out.println(shoppingCart.containsKey("Mac"));
        System.out.println(shoppingCart.containsValue(90000));
        System.out.println(shoppingCart.containsValue(60000));

    }
}
