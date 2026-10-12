package _01_arrayproblems;

public class Example1SumAndAverage {

    public static void calculate(int [] arr){
        int sum=0;
        for (int i : arr){
            sum+=i;
        }
        System.out.println("Sum of elements are "+sum);
        System.out.println("Average is  "+(double)sum/ arr.length);
    }


    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        calculate(arr);
    }
}
