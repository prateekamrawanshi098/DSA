package sorting.mergesort;

public class MergeSort {
    public static void merge(int [] arr, int start, int end){
        int mid = (start+end)/2;
        int first =start;
        int sec=mid+1;
        int pos=0;

        int [] brr= new int[end-start+1];
        while ((first<=mid) && sec<=end){
            if (arr[first]<=arr[sec]){
                brr[pos]=arr[first];
                first++;
            }
            else {
                brr[pos]=arr[sec];
                sec++;
            }
            pos++;
        }
        while (first<=mid){
            brr[pos]=arr[first];
            first++;
            pos++;
        }
        while (sec<=end) {
            brr[pos]=arr[sec];
            pos++;
            sec++;
        }
        for (int j = 0,k=start; j <brr.length ; j++,k++) {
            arr[k]=brr[j];
        }
    }

    public static void split(int [] arr, int start, int end){
        if (start<end){
            int mid=(start+end)/2;
            split(arr,start,mid);
            split(arr,mid+1,end);
            merge(arr,start,end);
        }
    }
}
