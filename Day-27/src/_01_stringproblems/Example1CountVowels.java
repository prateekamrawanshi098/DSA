package _01_stringproblems;

//TC->O(n)
//SC->O(n)
public class Example1CountVowels {
    public static int countVowels(String s){  //TC->O(n)   ,SC->O(n)
        int count=0;
        for (char c:s.toLowerCase().toCharArray()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ){
                count++;
            }
        }
        return count;
    }

    public static int countVowels2(String s) {  //TC->O(n)   ,SC->O(1)
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            s=s.toLowerCase();
            char ch = s.charAt(i);
            switch (ch){
                case 'a', 'e','i','o','u'  -> count++;
            }
        }
        return count;
    }



    public static void main(String[] args) {
        String s="Prateek Amrawanshi";
        System.out.println(countVowels2(s));
    }
}
