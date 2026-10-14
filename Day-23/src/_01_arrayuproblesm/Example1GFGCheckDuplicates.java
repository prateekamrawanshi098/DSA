package _01_arrayuproblesm;

import java.util.Arrays;

public class Example1GFGCheckDuplicates {
    public static boolean checkDuplicates(int []arr) {
        Arrays.sort(arr);
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]==arr[i+1])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr1={4, 5, 6, 4};
        int [] arr2={1,2,4,5};
        System.out.println(checkDuplicates(arr1));
        System.out.println(checkDuplicates(arr2));

    }
}
