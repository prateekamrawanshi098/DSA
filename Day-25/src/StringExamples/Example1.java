package StringExamples;

public class Example1 {
    public static void main(String[] args) {
        String s1=new String();
        String s2="Prateek";
        char [] arr = {'S','O','F','T','W','A','R','E'};
        String s3= new String(arr);
        String s4=new String(arr,2,4);
        System.out.println("s1= "+s1);
        System.out.println("s2= "+s2);
        System.out.println("s3= "+s3);
        System.out.println("s4= "+s4);

    }
}
