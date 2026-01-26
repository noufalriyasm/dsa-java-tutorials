package linkedList;

public class DoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    int size;

    public DoublyNode createDoublyLinkedList(int nodeValue) {
        DoublyNode doublyNode = new DoublyNode();
        doublyNode.value = nodeValue;
        doublyNode.next = null;
        doublyNode.prev = null;
        head = doublyNode;
        tail = doublyNode;
        size = 1;
        return head;
    }

    public void insertDoublyLinkedList(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if (head == null) {
            createDoublyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {
            DoublyNode currentNode = head;
            int index = 0;
            while (index < location - 1) {
                currentNode = currentNode.next;
                index++;
            }
            newNode.next = currentNode.next;
            newNode.prev = currentNode;
            currentNode.next.prev = newNode;
            currentNode.next = newNode;
        }
        size++;
    }

    public void traversalOfDoublyLinkedList(){
        DoublyNode currentNode=head;
        if(head == null){
            System.out.println("Dll doesn't exist");
        }
        else {
            for (int i=0;i<size;i++){
                System.out.print(currentNode.value);
                if(i != size-1){
                    System.out.print(" - > ");
                }
                currentNode=currentNode.next;
            }
        }
        System.out.println();
    }

    public void reverseTraversalOfDll(){
        if(head==null){
            System.out.println("Dll doesn't exist");
        }else {
            DoublyNode currentNode=tail;
            for(int i=0;i<size;i++){
                System.out.print(currentNode.value);
                if(i != size-1){
                    System.out.print(" <- ");
                }
                currentNode=currentNode.prev;
            }
        }
        System.out.println(" ");
    }

    public void searchingValueInDll(int searchValue){
        if(head !=null) {
            DoublyNode currentNode=head;
            for(int i=0;i<size-1;i++){
                if(currentNode.value==searchValue){
                    System.out.println("the value found at "+i);
                    return;
                }
                currentNode=currentNode.next;
            }
        }
        System.out.println("the Dll doesnt exist");
    }

    public void deletionInDll(int location){
        if(head == null){
            System.out.println("Dll doesnt exist");
            return;
        }else if (location ==0){
            if(size==1){
                head=null;
                tail=null;
                size--;
            }
            else {
                head=head.next;
                head.prev=null;
                size--;
            }
        } else if (location>=size-1) {
            if(size==1){
                head=null;
                tail=null;
                size--;
            }else {
                tail=tail.prev;
                tail.next=null;
                size--;
            }
        }else {
            DoublyNode currentNode=head;
            for (int i=0;i<location-1;i++){
                currentNode=currentNode.next;
            }
            currentNode.next=currentNode.next.next;
            currentNode.next.prev=currentNode;
            size--;
        }
    }

    public void deleteEntireDll(){
        DoublyNode currentNode=head;
        for (int i=0;i<size-1;i++){
            currentNode.prev=null;
            currentNode=currentNode.next;
        }
        head=null;
        tail=null;
        System.out.println("The Dll has been deleted");
    }
}
