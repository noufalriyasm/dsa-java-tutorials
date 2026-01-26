package stack;

import linkedList.SinglyLinkedList;

public class StackUsingLinkedList {
    SinglyLinkedList singlyLinkedList;

    public StackUsingLinkedList(){
        singlyLinkedList=new SinglyLinkedList();
    }

    // push method
    public void push(int value){
        singlyLinkedList.insertInLinkedList(value,0);
        System.out.println("value inserted successfully");
    }

    public boolean isEmpty(){
       return singlyLinkedList.head == null;
    }

    public int pop(){
        int result=-1;
        if(isEmpty()){
            System.out.println("the stack is empty");

        }
        else {
             result=singlyLinkedList.head.value;
             singlyLinkedList.deletionOfNode(0);
        }
        return result;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("the stack is empty");
            return -1;
        }else {
            return singlyLinkedList.head.value;
        }
    }

    public void deleteMethod(){
        singlyLinkedList.head=null;
        System.out.println("the stack is deleted successfully");
    }
}
