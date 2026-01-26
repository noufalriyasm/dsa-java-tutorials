package stack;

public class Stack {
    public int[] arr;
    int topOfStack;

    public Stack(int size){
        this.arr=new int[size];
        this.topOfStack=-1;
        System.out.println("the stack is created with a size of "+size);
    }

    public boolean isEmpty(){
        return topOfStack == -1;
    }
    public boolean isFull(){
        return topOfStack==arr.length-1;
    }

    //push method
    public void push(int value){
        if(isFull()){
            System.out.println("the stack is full");
        }
        else {
            arr[topOfStack+1]=value;
            topOfStack++;
            System.out.println("the value is successfully inserted");
        }
    }

    //pop will delete the last element from the stack
    public int pop(){
        if(isEmpty()){
            System.out.println("the stack is empty");
            return -1;
        }
        else {
            int topStack=arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    // peek will not delete the last element from the stack
    public int peek(){
        if(isEmpty()){
            System.out.println("the stack is empty");
            return -1;
        }
        else {
            return arr[topOfStack];
        }
    }



}
