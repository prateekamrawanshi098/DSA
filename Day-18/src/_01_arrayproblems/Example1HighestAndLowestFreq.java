package _01_arrayproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Example1HighestAndLowestFreq {
    public static int [] degree(int [] arr){
        Map<Integer,Integer> map=new HashMap<>();
        for (int x: arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int maxvalue=0;
        int maxKey=0;
        int minValue=Integer.MAX_VALUE;
        int minKey=Integer.MAX_VALUE;

        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            int value=entry.getValue();
            if(value>maxvalue){
                maxvalue=value;
                maxKey= entry.getKey();
            }
            if (value<minValue){
                minValue=value;
                minKey=entry.getKey();
            }
        }
        return new int [] {minKey,maxKey};
    }

    public static void main(String[] args) {
        int [] arr={1,1,1,2,2,4,4,4,4,4,5,6,7,7,2};
        int [] brr=degree(arr);
        System.out.println(Arrays.toString(brr));
    }
}
