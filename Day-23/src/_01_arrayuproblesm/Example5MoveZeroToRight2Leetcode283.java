package _01_arrayuproblesm;

import java.util.Arrays;

public class Example5MoveZeroToRight2Leetcode283 {
    public static void moveZeroes(int[] nums) {
        for (int r = 0,w=0; r <nums.length ; r++) {
            if (nums[r]!=0){
                int temp=nums[r];
                nums[r]=nums[w];
                nums[w]=temp;
                w++;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
