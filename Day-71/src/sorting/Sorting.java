package sorting;

import java.util.Arrays;

public class Sorting {

    private static void bubbleSort(int[] arr) {

        for (int i = 0; i <arr.length-1 ; i++) {
            boolean swap=false;
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if (!swap){
                break;
            }
        }
    }

    public static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            if (min!=i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {10, 5, 12, 21, 4, 31, 16, 7, 8};
        System.out.println("Before Sorting : "+ Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After Sorting : "+ Arrays.toString(arr));

    }

}
