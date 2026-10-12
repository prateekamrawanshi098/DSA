package _01Entry;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example01 {
    public static void main(String[] args) {
        Map<String,Integer> cart = new HashMap<>();
        cart.put("Dell",100000);
        cart.put("Lenovo",120000);
        cart.put("Mac",130000);

        Set<Map.Entry<String,Integer>> cartSet = cart.entrySet();
        for (Map.Entry<String,Integer> p : cartSet){
            System.out.println(p.getKey()+" \t"+p.getValue());
        }
    }
}
