package _01_twopointers;

import java.util.Arrays;

public class Example4TwoSumSortedArrayTwoPointer {
    public static int []  twoSum(int [] arr,int target) {
        int left=0;
        int right=arr.length-1;
        int sum;
        while(left<right){
            sum=arr[left]+arr[right];
            if (sum==target){
                return new int[]{arr[left],arr[right]};
            }
            else if (sum>target){
                right--;
            }
            else
                left++;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int [] arr={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
