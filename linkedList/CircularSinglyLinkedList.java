package linkedList;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    /**
     * creating circular singly linked list
     * @param nodeValue
     */
    public void createCircularSinglyLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = size + 1;
    }

    /**
     * inserting a node in circular sll
     * @param nodeValue
     * @param location
     */
    public void insertionInCircularSll(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createCircularSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            tail.next = node;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            node.next = head;
            tail = node;
        } else {
            Node currentNode = head;
            int index = 0;
            while (index < location - 1) {
                currentNode = currentNode.next;
                index++;
            }
            node.next = currentNode.next;
            currentNode.next = node;
        }
        size++;
    }

    /**
     * traversal through circular Sll
     */
    public void traversingThroughCircularSll(){
        if(head!=null){
            Node currentNode=head;
            int index=0;
            while(index<size){
                System.out.println(currentNode.value);
                if(index<size-1){
                    System.out.println(" -> ");
                }
                currentNode=currentNode.next;
                index++;
            }
        }
        else System.out.println("Csll doesn't exist");
    }

    /**
     * searching for a node value
     */

    public boolean searchingForANodeValue(int searchValue){
        if(head !=null){
            Node currentNode=head;
            for(int i=0;i<size;i++){
                if(currentNode.value==searchValue){
                    System.out.println("LinkedList.Node found at "+i);
                    return true;
                }
                currentNode=currentNode.next;
            }
        }
        System.out.println("Csll doesn't exits");
        return false;
    }

    /**
     * deleting a specific node Csll
     * @param location
     */

    public void deleteCircularSllNode(int location){
        if(head==null){
            System.out.println("Csll doesn't exist");
            return;
        }else if(location==0){
            head=head.next;
            tail.next=head;
            size--;
            if(size==0){
                tail=null;
                head.next=null;
                head=null;
            }
        } else if (location>=size) {
            Node currentNode=head;
            for(int i=0;i<location-1;i++){
                currentNode=currentNode.next;
            }
            if(currentNode==head){
                head.next=null;
                head=null;
                tail=null;
                size--;
                return;
            }
            currentNode.next=head;
            tail=currentNode;
            size--;
        }else {
            Node currentNode=head;
            for (int i=0;i<location-1;i++){
                currentNode=currentNode.next;
            }
            currentNode.next =currentNode.next.next;
            size--;
        }
    }

    public void deleteCircularSll(){
        if(head== null){
            System.out.println("Csll doesnt exist");
        }else {
            head=null;
            tail.next=null;
            tail=null;
            System.out.println("The csll has been deleted");
        }
    }

}
