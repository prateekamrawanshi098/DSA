package search.binarysearch;

public class BinarySearch {

    public static int binarySearch(int [] arr, int x){
        int low=0;
        int high=arr.length-1;
        int mid;

        while (low<=high) {
            mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            else if (arr[mid]>x){
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr= {10, 23,12,6, 3, 18, 19, 42 ,12,45, 13};
        System.out.println(binarySearch(arr,18));
        System.out.println(binarySearch(arr,100));
    }

}
