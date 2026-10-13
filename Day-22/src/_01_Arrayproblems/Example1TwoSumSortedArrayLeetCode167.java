package _01_Arrayproblems;

import java.util.Arrays;

public class Example1TwoSumSortedArrayLeetCode167 {
    public static int[] twoSum(int[] numbers, int target) {
        int i=0, j=numbers.length-1;
        int sum;
        while(i<j){
            sum=numbers[i]+numbers[j];
            if(sum==target){
                return new int [] {i+1,j+1};
            }
            else if(sum>target){
                j--;
            }
            else
                i++;
        }
        return new int[] {};
    }

    public static void main(String[] args) {
       int [] numbers = {2,7,11,15};
       int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
}
