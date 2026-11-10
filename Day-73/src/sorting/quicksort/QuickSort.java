package sorting.quicksort;

public class QuickSort {

    public  void quick(int [] arr , int low, int high){
        if (low<high){
            int j=partition(arr,low,high);
            quick(arr,low,j);
            quick(arr,j+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int i=low;
        int j=high;
        int pivot=arr[low];
        do {
            do {
                i++;
            }while (arr[i]<=pivot);
            do {
                j--;
            }while (arr[j]>pivot);
            if (i<j){
                swap(arr,i,j);
            }
        }while (i<j);
        swap(arr,j,low);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
