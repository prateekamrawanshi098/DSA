package _01_stringproblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//TC-O(n) , SC->O(n)
public class Example7UniqueCharCount {
    public static int uniqueCount(String s) {
        Set<Character>set=new HashSet<>();
        for (char ch : s.toCharArray()){
            set.add(ch);
        }
        return set.size();
}

    public static void main(String[] args) {
        String s="output";
        System.out.println(uniqueCount(s));
    }
}
