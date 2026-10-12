package _01_arrayproblems;

public class Example2FindArrayIndexOfElement {
    public static int index(int element,int [] arr) {
        int i = 0;
        for (int x : arr) {
          if (x==element)
              return i;
          else
              i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr= {10,20,30,40,50};
        int n=index(90,arr);
        if (n!=-1){
            System.out.println(n);
        }
        else
          System.out.println("NO such element in Array");
    }
}
