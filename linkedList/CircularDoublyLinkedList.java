package linkedList;

public class CircularDoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    Integer size = 0;

    public void createDoublyLinkedList(int nodeValue) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = newNode;
        newNode.prev = newNode;
        head = newNode;
        tail = newNode;
        size++;
    }

    public void insertionOfNodeInDll(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (head == null) {
            createDoublyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        } else {
            DoublyNode currentNode = head;
            for (int i = 0; i < location; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            newNode.prev = currentNode;
            currentNode.next.prev = newNode;
            currentNode.next = newNode;
        }
        size++;
    }

    public void traversalOfCdll() {
        if (head == null) {
            System.out.println("the cdll doesnt exist");
            return;
        } else {
            DoublyNode currentNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(currentNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                currentNode = currentNode.next;
            }
        }
        System.out.println();
    }

    public void searchingOfValue(int searchingValue) {
        if (head == null) {
            System.out.println("the cdll doesnt exist");
            return;
        } else {
            DoublyNode currentNode = head;
            for (int i = 0; i < size; i++) {
                if (currentNode.value == searchingValue) {
                    System.out.println("the value found at " + i);
                    return;
                }
                currentNode = currentNode.next;
            }
            System.out.println("the value doesnt exist");
        }
    }

    public void deletionOfNodeInCdll(int location) {
        if (head == null) {
            System.out.println("the cdll doesnt exist");
        } else if (location == 0) {
            if (size == 1) {
                head.next = null;
                head.prev = null;
                head = null;
                tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size--;

            }

        }
        else if (location>=size){
            if (size==1){
                head.prev=null;
                head.next=null;
                head=null;
                tail=null;
                size--;
                return;
            }
            else {
                tail=tail.prev;
                tail.next=head;
                head.prev=tail;
                size--;
            }
        }
        else {
            DoublyNode currentNode=head;
            for (int i=0;i<location-1;i++){
                currentNode=currentNode.next;
            }
            currentNode.next=currentNode.next.next;
            currentNode.next.prev=currentNode;
            size--;
        }

    }
    public void deleteEntireCdll(){
        DoublyNode currentNode=head;
        for (int i=0;i<size;i++){
            currentNode.prev=null;
            currentNode=currentNode.next;
        }
        head=null;
        tail=null;
        System.out.println("the cdll deleted successfully");
    }
}
