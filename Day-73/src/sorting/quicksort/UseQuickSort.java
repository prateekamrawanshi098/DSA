package sorting.quicksort;

import java.util.Arrays;

public class UseQuickSort {
    public static void main(String[] args) {
        int [] arr = {10,6,11,9,18,24,2,12,10000};
        QuickSort sort=new QuickSort();
        sort.quick(arr,0,arr.length-1);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(arr));
    }
}
