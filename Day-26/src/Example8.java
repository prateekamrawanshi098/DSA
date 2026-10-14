public class Example8 {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer("RAHUL");
        System.out.println("sb1 is "+sb1);
        System.out.println("Its capacity is "+sb1.capacity());
        System.out.println("Its length is "+sb1.length());

        sb1.reverse();
        System.out.println("sb1 is "+sb1);
        System.out.println("Its capacity is "+sb1.capacity());
        System.out.println("Its length is "+sb1.length());
    }
    }

