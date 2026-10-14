package _01_arrayuproblesm;

import java.util.HashSet;

public class Example2GFGCheckDuplicate2 {
    public static boolean checkDuplicates(int []arr) {
        HashSet<Integer>set=new HashSet<>();
        for (int x:arr){
            boolean flag=set.add(x);
            if (!flag){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr1={4, 5, 6, 4};
        int [] arr2={1,2,4,5};
        System.out.println(checkDuplicates(arr1));
        System.out.println(checkDuplicates(arr2));

    }
}
