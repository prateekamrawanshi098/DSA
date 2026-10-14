package _01_arrayuproblesm;

import java.util.Arrays;

public class Example5MoveZeroToRightLeetcode283 {
    public static void moveZeroes(int[] nums) {
        int [] arr=new int[nums.length];
        for (int i = 0,j=0; i <nums.length ; i++) {
           if (nums[i]!=0){
               arr[j++]=nums[i];
           }

        }
        System.arraycopy(arr,0,nums,0,nums.length);
    }

    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
