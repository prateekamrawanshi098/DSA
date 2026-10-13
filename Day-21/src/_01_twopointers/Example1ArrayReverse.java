package _01_twopointers;

import java.util.Arrays;

public class Example1ArrayReverse {
    public static int[] reverse(int [] arr){
        int i=0; int j=arr.length-1;
        int temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        System.out.println("Before reverse");
        System.out.println(Arrays.toString(arr));
        System.out.println("After sorting");
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
