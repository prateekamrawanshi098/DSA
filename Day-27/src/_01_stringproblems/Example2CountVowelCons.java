package _01_stringproblems;

public class Example2CountVowelCons {
    public  static  String count(String s){ //TC->O(n) , SC->O(1)
        int vowel=0;
        int cons=0;
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'){
                vowel++;
            }
            else
                cons++;
        }
        return (vowel>cons)? "Yes" : (vowel<cons)?"No" :"Same";
    }

    public static void main(String[] args) {
        String s="aeioubcdfg";
        System.out.println(count(s));
    }
}
