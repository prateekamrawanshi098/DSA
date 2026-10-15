package _01_stringproblems;

import java.util.HashMap;
import java.util.Map;

//TC-O(n) , SC->O(n)
public class Example5CountMaxFreq {
    public static char getMaxOccuringChar(String s) {
        Map <Character,Integer>map=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        char maxFreq=' ';
        int max=0;
        for (Map.Entry<Character,Integer> entry : map.entrySet() ){
            if (entry.getValue()>max){
                max=entry.getValue();
                maxFreq=entry.getKey();
            }
            else if(entry.getValue()==max){
                if (maxFreq> entry.getKey()){
                    maxFreq= entry.getKey();
                }
            }
        }
        return maxFreq;
    }

    public static void main(String[] args) {
        String s="output";
        System.out.println(getMaxOccuringChar(s));
    }
}
