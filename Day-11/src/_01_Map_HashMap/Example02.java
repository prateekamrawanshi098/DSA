package _01_Map_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Example02 {
    public static void main(String[] args) {
        Map<String,Integer> shoppingCart = new HashMap<>();

        shoppingCart.put("Dell",90000);
        shoppingCart.put("Lenovo",80000);
        shoppingCart.put("HP",70000);
        shoppingCart.put("Dell",100000);



        System.out.println(shoppingCart);


        System.out.println(shoppingCart.size());
        shoppingCart.clear();
        System.out.println(shoppingCart.size());
        System.out.println(shoppingCart);

    }
}
