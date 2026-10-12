package _01_arrayproblems;

public class Example2ShiftByOne {
    public static void shiftByOne(int [] arr){
        int temp=arr[arr.length-1];
        for (int i = arr.length-1; i >0 ; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }

    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        shiftByOne(arr);

        for (int x:arr){
            System.out.print(x+" ");
        }
    }
}
