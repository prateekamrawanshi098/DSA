package _01_Map_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Example04 {
    public static void main(String[] args) {
        Map<String,Integer> shoppingCart = new HashMap<>();

        shoppingCart.put("Dell",90000);
        shoppingCart.put("Lenovo",80000);
        shoppingCart.put("HP",70000);

        System.out.println(shoppingCart.remove("Dell"));
        System.out.println(shoppingCart.remove("hp"));
        System.out.println(shoppingCart);

    }
}
