package linkedList;

public class SinglyLinkedListProblems {
    public Node head;
    public Node tail;
    public int size;
    /*
    Implement the following on the LinkedList.SinglyLinkedList class:
    push
    This function should take in a value and add o node to the end of the LinkedList.SinglyLinkedList.
    LinkedList.SinglyLinkedList singlyLinkedList = new LinkedList.SinglyLinkedList();
    singlyLinkedList.push(5)  // Success
    singlyLinkedList.size   // 1
    singlyLinkedList.head.value // 5
    singlyLinkedList.tail.value // 5

    singlyLinkedList.push(10)    // Success
    singlyLinkedList.size      // 2
    singlyLinkedList.head.value    // 5
    singlyLinkedList.head.next.value  // 10
    singlyLinkedList.tail.value    // 10
    */
    public void createSinglyLinkedListNode(int nodeValue){
        Node node=new Node();
        node.next=null;
        node.value=nodeValue;
        head=node;
        tail=node;
        size++;
//        return head;
    }
    public void push(int nodeValue){
        if(head == null){
            createSinglyLinkedListNode(nodeValue);
        }
        else {
            Node node=new Node();
            node.next=null;
            node.value=nodeValue;
            tail.next=node;   // tail means simply the last node;
            tail=node;
            size++;
        }
    }

    /*
    Implement the following on the LinkedList.SinglyLinkedList class:
    pop
    This function should remove a node at the end of the LinkedList.SinglyLinkedList. It should return the node removed.
    Examples
    LinkedList.SinglyLinkedList singlyLinkedList = new LinkedList.SinglyLinkedList();
    singlyLinkedList.push(5);
    singlyLinkedList.push(10);
    singlyLinkedList.pop().value // 10
    singlyLinkedList.tail.value  // 5
    singlyLinkedList.size;   // 1
    singlyLinkedList.pop().value; // 5
    singlyLinkedList.size;   // 0
    singlyLinkedList.pop()   // The SLL does not exist
     */

    public Node pop(){
        if(head == null){
            System.out.println("sll doesnt exist");
            return null;
        }
        Node removedNode;
        Node currentNode;

        if(head==tail){
            removedNode=head;
            head.next=null;
            tail.next=null;
        }else {
            currentNode=head;
            for(int i=0;i<size-1;i++){
                currentNode=currentNode.next;
            }
            removedNode=currentNode.next;
            currentNode.next=null;
            tail=currentNode;
        }
        size--;
        return removedNode;
    }


}
