package _01_arrayproblems;

import java.util.HashMap;
import java.util.Map;

public class Example1Leecode3005 {
    public static int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int maxFreq=0;
        int sum=0;
        for(int x:map.values()){
            if(x>maxFreq){
                maxFreq=x;
                sum=x;
            }
            else if(x==maxFreq){
                sum+=x;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(nums));
    }
}
