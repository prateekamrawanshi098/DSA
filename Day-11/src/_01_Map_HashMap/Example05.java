package _01_Map_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example05 {
    public static void main(String[] args) {
        Map<String,Integer> shoppingCart = new HashMap<>();

        shoppingCart.put("Dell",90000);
        shoppingCart.put("Lenovo",80000);
        shoppingCart.put("HP",70000);

        Set<String> product = shoppingCart.keySet();
        System.out.println(product);

    }
}
