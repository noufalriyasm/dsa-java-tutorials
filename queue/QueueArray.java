package queue;

public class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size) {
        this.arr = new int[size];
        this.beginningOfQueue = -1;
        this.topOfQueue = -1;
        System.out.println("The queue is successfully created with size of: " + size);
    }

    public boolean isFull() {
        return topOfQueue == arr.length - 1;
    }

    public boolean isEmpty() {
        return topOfQueue == -1;
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("the queue is full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("succesfully inserted " + value + " in the queue");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("succesfully inserted " + value + " in the queue");
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("the queue is empty");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;

            if (beginningOfQueue > topOfQueue) { // last element
                topOfQueue = beginningOfQueue = -1;  //after deleting last element the que is empty
            }
            return result;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("the queue is empty");
            return -1;
        }
        else {
            return arr[beginningOfQueue];
        }
    }

    public void deleteQue(){
        arr=null;
        topOfQueue=beginningOfQueue=-1;
        System.out.println("queue is deleted successfully");
    }
}
