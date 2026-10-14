public class Example6 {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer("I Love");
        System.out.println("sb1 is "+sb1);
        System.out.println("Its capacity is "+sb1.capacity());
        System.out.println("Its length is "+sb1.length());

        sb1.append(" programming");
        System.out.println("sb1 is "+sb1);
        System.out.println("Its capacity is "+sb1.capacity());
        System.out.println("Its length is "+sb1.length());

        sb1.append(" and problem solving");
        System.out.println("sb1 is "+sb1);
        System.out.println("Its capacity is "+sb1.capacity());
        System.out.println("Its length is "+sb1.length());
    }
    }

