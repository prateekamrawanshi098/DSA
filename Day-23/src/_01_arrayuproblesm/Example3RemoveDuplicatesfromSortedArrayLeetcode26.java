package _01_arrayuproblesm;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example3RemoveDuplicatesfromSortedArrayLeetcode26 {
    public static int removeDuplicates(int [] nums) {
        Set<Integer>set=new LinkedHashSet<>();
        for (int x:nums){
            set.add(x);
        }
        int i=0;
        for (int x:nums){
            nums[i++]=x;
        }
        return set.size();
    }

    public static void main(String[] args) {
        int [] arr={-3,-1,0,0,0,3,3};
        System.out.println(Arrays.toString(arr));
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}
