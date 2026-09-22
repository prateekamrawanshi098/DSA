package _01_Map_HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example06 {
    public static void main(String[] args) {
        Map<String,Integer> shoppingCart = new HashMap<>();

        shoppingCart.put("Dell",90000);
        shoppingCart.put("Lenovo",80000);
        shoppingCart.put("HP",70000);

        Collection<Integer> prices = shoppingCart.values();
        System.out.println(prices);

        int total=0;
        for (Integer i:prices){
            total+=i;
        }
        System.out.println("Total price of cart is "+total);

    }
}
