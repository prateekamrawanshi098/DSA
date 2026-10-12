package _01_arrayproblems;

public class Example1FirstUnsortedElement {
    public static int firstUnsortedElement(int [] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i+1]<arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {10,20,30,3,5,40,50};
        System.out.println(firstUnsortedElement(arr));
    }
}
