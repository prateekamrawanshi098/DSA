package _01_twopointers;

public class Example2CheckPalindromeBruteForce {
    public static boolean isPalindrome(String s){
        String str="";
        for (int i = s.length()-1; i >=0 ; i--) {
            str+=s.charAt(i);
        }
        return str.equals(s);
    }

    public static void main(String[] args) {
        String s1="NITIN";
        System.out.println(isPalindrome(s1));

        String s2="NAVIN";
        System.out.println(isPalindrome(s2));
    }
}
