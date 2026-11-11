package sorting.heapsort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class heapSort {
    public static void insert(int [] arr,int child , int n){
        int par;
        while (child>1){
            par=child/2;
            if (arr[par]>n){
                arr[child]=n;
                return;
            }
            arr[child]=arr[par];
            child=par;
        }
        arr[1]=n;
    }

    public static int remove(int [] arr, int n){
        int temp;
        int x=arr[1];
        arr[1]=arr[n];
        n--;
        int i=1,j=2*i;
        while (j<=n){
            if (j<n){
                if (arr[j+1]>arr[j]){
                    j=j+1;
                }
            }
            if (arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i=j;
                j=j*2;
            }
            else break;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        int arr[]=new int [8];
        for (int i=1;i<=arr.length-1;i++){
            System.out.println("Enter no : ");
            int n= kb.nextInt();
            insert(arr,i,n);
        }
        System.out.println("the heap is : ");
        System.out.println(Arrays.toString(arr));
        for (int i=arr.length-1;i>=1;i--){
            arr[i]=remove(arr,i);
        }
        System.out.println("Sorted array is : ");
        System.out.println(Arrays.toString(arr));
    }
}
