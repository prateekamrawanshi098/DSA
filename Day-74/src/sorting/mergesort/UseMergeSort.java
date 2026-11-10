package sorting.mergesort;

import java.util.Arrays;

public class UseMergeSort {
    public static void main(String[] args) {
        int [] arr = {10,4,6,11,9,12};
        MergeSort.split(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
