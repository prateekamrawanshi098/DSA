package stackUsingArray.stackImpone;

public class Stack {
    private int TOS;
    private int []arr;
    private int size;

   public Stack(int size){
       this.size=size;
       TOS=-1;
       arr=new int [size];
   }

    public void push(int e){
       if (TOS==size-1){
           System.out.println("Stack overflow");
           return;
       }
       arr[++TOS]=e;
    }

    public int pop(){
       if(TOS==-1){
           System.out.println("Stack underflow");
           return -1;
       }
       return arr[TOS--];
    }

    public int peek(){
        if(TOS==-1){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[TOS];
    }




}
