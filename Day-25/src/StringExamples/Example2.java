package StringExamples;

public class Example2 {
    public static void main(String[] args) {
        String s1=new String("Bhopal");
        String s2=new String("Bhopal");
        String s3=new String("BHOPAL");
        String s4=new String("BhOPal");
        String s5=new String("BHOJPAL");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareToIgnoreCase(s3));
        System.out.println(s1.compareToIgnoreCase(s4));
        System.out.println(s1.compareToIgnoreCase(s5));
    }
}
