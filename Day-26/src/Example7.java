public class Example7 {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer("SOFTWARE");
        System.out.println("sb1 is "+sb1);
        System.out.println("Its capacity is "+sb1.capacity());
        System.out.println("Its length is "+sb1.length());

        sb1.delete(1,4);
        System.out.println("sb1 is "+sb1);
        System.out.println("Its capacity is "+sb1.capacity());
        System.out.println("Its length is "+sb1.length());
    }
    }

