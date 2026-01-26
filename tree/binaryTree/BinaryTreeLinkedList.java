package tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLinkedList {
    public BinaryNode root;

    public BinaryTreeLinkedList() {
        this.root = null;
    }

    /**
     * pre order traversal
     */

    public void preOrderBinaryTree(BinaryNode node) {
        if (node == null) {                  //------------ O(1)
            return;                        //------------ O(1)
        }
        System.out.println(node.value + " ");            //------------ O(1)
        preOrderBinaryTree(node.left);                    //------------ O(N/2)  here because each node have one left and one right,so for N nodes N/2 left and N/2 right
        preOrderBinaryTree(node.right);                  //------------ O(N/2)
    }

    //  total Time complexity ------------ O(N)
    //  total space complexity ------------ O(N)

    public void inOrderBinaryTreeTraversal(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrderBinaryTreeTraversal(node.left);
        System.out.println(node.value + " ");
        inOrderBinaryTreeTraversal(node.right);
    }

    public void postOrderBinaryTreeTraversal(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrderBinaryTreeTraversal(node.left);
        postOrderBinaryTreeTraversal(node.right);
        System.out.println(node.value + " ");
    }

    public void levelOrderBinaryTreeTraversal(BinaryNode node){
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);

        while (!queue.isEmpty()){
            BinaryNode currentNode=queue.remove();
            System.out.print(currentNode.value + " ");
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if (currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
    }

    public void searchInBinaryTree(String value){
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode currentNode=queue.remove();

            if(currentNode.value == value){
                System.out.println("the value "+ value +" found in tree");
                return;
            }
            else {
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
                if (currentNode.right !=null){
                    queue.add(currentNode.right);
                }
            }
        }
        System.out.println("the value "+value + " not found in tree");
    }

    public void insertNode(String value){
        BinaryNode newNode=new BinaryNode();
        newNode.value=value;

        if(root== null){
            root=newNode;
            System.out.println("the node added successfully");
            return;
        }
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);

        while (!queue.isEmpty()){
            BinaryNode currentNode=queue.remove();
            if(currentNode.left== null){
                currentNode.left=newNode;
                System.out.println("the node added successfully");
                break;
            }
            else if (currentNode.right == null){
                currentNode.right=newNode;
                System.out.println("the node added successfully");
                break;
            }
            else {
                queue.add(currentNode.left);
                queue.add(currentNode.right);
            }
        }
    }

    public BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode currentNode=null;
        while (!queue.isEmpty()){
            currentNode=queue.remove();
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return currentNode;
    }

    public void deleteDeepestNode(){
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);

        BinaryNode previousNode,currentNode=null;

        while (!queue.isEmpty()){
            previousNode=currentNode;
            currentNode=queue.remove();

            if(currentNode.left == null){
                previousNode.right=null;
                return;
            }
            else if (currentNode.right == null){
                currentNode.left= null;
                return;
            }

            queue.add(currentNode.left);
            queue.add(currentNode.right);
        }
    }

    public void deleteGivenNode(String value){
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode currentNode=queue.remove();

            if(currentNode.value == value){
                currentNode.value=getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("the node deleted successfully");
                return;
            }
            else {
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }  if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }

        }
        System.out.println("the node doesn't exist");
    }

    public void deleteBinaryTree(){
        this.root=null;
        System.out.println("Binary tree has been deleted successfully");
    }
}
