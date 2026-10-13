package _01_twopointers;

public class Example3CheckPalindromeTwoPointer {
    public static boolean isPalindrome(String s) {
        int i=0, j=s.length()-1;
        boolean flag=true;
        while(i<j){
            if (s.charAt(i)!=s.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;

        }
        return flag;
    }

    public static void main(String[] args) {
        String s1="NITIN";
        System.out.println(isPalindrome(s1));

        String s2="NAVIN";
        System.out.println(isPalindrome(s2));
    }
}
