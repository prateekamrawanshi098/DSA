package _01_arrayproblems;

import java.util.Arrays;

public class Example3SwapAlternate {

    public static void swap(int [] arr){
        for (int i = 0; i < arr.length-1 ; i+=2) {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }

    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60};
        System.out.println(Arrays.toString(arr));
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }

}
