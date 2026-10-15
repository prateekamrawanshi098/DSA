package _01_stringproblems;

// TC-> O(n) , SC-> O(1)

public class Example3CountDigits {
    public static int countD(String s) {
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            if (Character.isDigit(s.charAt(i))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s="abc123efg456";
        System.out.println(countD(s));
    }
}
