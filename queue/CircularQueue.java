package queue;

public class CircularQueue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    public CircularQueue(int size){
        this.arr=new int[size];
        this.size=size;
        topOfQueue=-1;
        beginningOfQueue=-1;
        System.out.println("the queue is successfully created with a size of "+size);
    }

//    public boolean isEmpty(){
//        return topOfQueue==-1;
//    }

//    public boolean isFull(){
//        if (topOfQueue+1==beginningOfQueue){
//            return true;
//        }
//        else if (beginningOfQueue == 0 && topOfQueue+1==size){
//            return true;
//        }
//        else return false;
//    }

    public boolean isFull(){
        return (topOfQueue + 1) % size == beginningOfQueue;
    }

    public void enqueue(int value){
        if(beginningOfQueue== -1 && topOfQueue ==-1){
            beginningOfQueue=topOfQueue=0;
            arr[topOfQueue]=value;
        }else if((topOfQueue+1)%size == beginningOfQueue){
            System.out.println("the queue is full");
        }
        else {
            topOfQueue=(topOfQueue+1)%size;
            arr[topOfQueue]=value;
        }
    }

    public void deQueue(){
        if(topOfQueue ==-1 && beginningOfQueue == -1){
            System.out.println("the queue is empty");
        }
        else if (topOfQueue == beginningOfQueue){   //if queue contain only one element
            int deQueuedElement=arr[beginningOfQueue];
            topOfQueue=beginningOfQueue=-1;
            System.out.println("the element dequeued is "+deQueuedElement);
        }
        else {
            int dequeuedElement=arr[beginningOfQueue];
            beginningOfQueue=(beginningOfQueue+1)%size;
        }
    }

    public void display(){
        int i=beginningOfQueue;
        if(beginningOfQueue ==-1 && topOfQueue ==-1){
            System.out.println("the queue is empty");
        }
        else {
            while (i != topOfQueue){
                System.out.print(arr[i]);
                i=(i+1) % size;
            }
            System.out.println(arr[topOfQueue]);
        }
    }

    public int peek(){
        if(topOfQueue == -1 && beginningOfQueue ==-1){
            System.out.println("the queue is empty");
            return -1;
        }
        else {
            return arr[beginningOfQueue];
        }
    }
}
