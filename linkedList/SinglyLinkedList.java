package linkedList;
public class SinglyLinkedList {
    public Node  head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) { // here initially there is no node,so creating a new one
        head = new Node();    // creating a head reference
        Node node = new Node();  // creating a new node adding
        node.next = null;   // this is only a single node ,there is other node after this node, so node.next becomes null
        node.value = nodeValue;   // assigning value
        head = node;  // now only a single node is present ,so both head and tail would be the same node
        tail = node;
        size = 1;
        return head;
    }

    // insertion of an element into linked list
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();   // create a new node for inserting
        node.value = nodeValue;   // assign the given value to created node value
        if (head == null) {     // checking the linked list contain head,if not creating a new node
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {  // checking the given location is first index,that is inserting at beginning
            node.next = head;   //here head already contain the reference of first element so assign that reference to next value of newly created node
            head = node;   // now the head points to the newly inserted node
        } else if (location >= size) {  // checking location is at the end
            node.next = null;  // if inserting at the end,the next value of newly created node becomes null ,because there is no next element
            tail.next = node; // the last element becomes the second last element,tail contain the reference of last element so last.next becomes newly added node
            tail = node;  // tail points to the last node
        } else {   // insertion in middle
            Node tempNode = head;  // creating a temp node for looping,initially its header
            int index = 0;
            while (index < location - 1) {  // locating the previous node  we can also use (tempNode.current != tail) condition
                tempNode = tempNode.next;  //here moving to next node
                index++;
            }
            Node nextNode = tempNode.next;   // so we have temp node after looping that contain the reference to next node ,so we are storing that reference to next node variable,
            tempNode.next = node; // inserting element  so the next node of temp node should be the newly inserted node
            node.next = nextNode;  // node next to the newly added node is previously stored nextNode
        }

        size++;   // after every addition increasing its size
    }


    public void traversingSinglyLinkedList() {
        if (head == null) {
            System.out.println("singly linked list does not exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println(" ");
    }


    public boolean searchingValueInSinglyLinkedList(int searchValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == searchValue) {
                    System.out.println("value found at " + i + " index");
                    return true;
                }
                tempNode = tempNode.next;
            }

        }
        System.out.println("LinkedList.Node doesn't exist");
        return false;
    }

    // deletion of node
    public void deletionOfNode(int location) {
        if (head == null) {
            System.out.println("singly linked list not found");
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }

        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    // deletion of entire singly linked list

    public void deleteSinglyLinkedList(){
        head=null;
        tail=null;
        System.out.println("sll deleted successfully");
    }

}
