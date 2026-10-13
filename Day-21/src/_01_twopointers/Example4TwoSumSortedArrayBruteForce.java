package _01_twopointers;

import java.util.Arrays;

public class Example4TwoSumSortedArrayBruteForce {
    public static int []  twoSum(int [] arr,int target) {
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]+arr[j]==target){
                    return new int [] {arr[i],arr[j]};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int [] arr={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
