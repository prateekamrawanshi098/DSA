package _01_stringproblems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//TC-O(n) , SC->O(n)
public class Example4CountFreqOfCharacter {
    public static Map<Character,Integer> freq(String s) {
        Map <Character,Integer>map=new LinkedHashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        return map;
    }

    public static void main(String[] args) {
        String s="APPLE";
        System.out.println(freq(s));
    }
}
