package _01_Arrayproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Example2TwoSumLeetCode1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(map.containsKey(diff)){
                return new int [] {map.get(diff),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int [] {};
    }

    public static void main(String[] args) {
        int [] arr= {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
}
