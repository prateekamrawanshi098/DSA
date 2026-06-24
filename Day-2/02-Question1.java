class Question1 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.println(arr);   //[I
        double[] brr = { 10.1, 20.2, 30.3, 40.4, 50.5 };
        System.out.println(brr);   //[D
    }
}


/*
When we print Array reference it will give hashcode
Hashcode is in the form of 
  1. for 1-D Array  :  [<capital_letter_of_datatype>
  2. for 2-D Array  :  [[<capital_letter_of_datatype>
  */