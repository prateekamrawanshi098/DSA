package _01_arrayuproblesm;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example4RemoveDuplicatesfromSortedArray2Leetcode26 {
    public static int removeDuplicates(int [] nums) {
        int w;
        int r;
        for ( w = 0,r=1; r<nums.length ; r++) {
            if (nums[w]!=nums[r]){
                w++;
                nums[w]=nums[r];
            }
        }
        return w+1;
    }

    public static void main(String[] args) {
        int [] arr={-3,-1,0,0,0,3,3};
        System.out.println(Arrays.toString(arr));
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}
