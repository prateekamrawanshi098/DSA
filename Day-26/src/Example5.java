public class Example5 {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer();
        System.out.println("sb1 is "+sb1);
        System.out.println("Its capacity is "+sb1.capacity());
        System.out.println("Its length is "+sb1.length());

        StringBuffer sb2=new StringBuffer(40);
        System.out.println("sb1 is "+sb2);
        System.out.println("Its capacity is "+sb2.capacity());
        System.out.println("Its length is "+sb2.length());

        StringBuffer sb3=new StringBuffer("HELLO");
        System.out.println("sb1 is "+sb3);
        System.out.println("Its capacity is "+sb3.capacity());
        System.out.println("Its length is "+sb3.length());
    }
    }

