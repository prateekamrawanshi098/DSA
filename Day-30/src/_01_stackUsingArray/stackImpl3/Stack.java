package _01_stackUsingArray.stackImpl3;

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
           StackException ex=new StackException("Stack Overflow");
           throw ex;
        }
        arr[++TOS]=e;
    }

    public int pop(){
        if(TOS==-1){
            StackException ex=new StackException("Stack Underflow");
            throw ex;
        }
        return arr[TOS--];
    }

    public int peek(){
        if(TOS==-1){
            StackException ex=new StackException("Stack Underflow");
            throw ex;
        }
        return arr[TOS];
    }

}
