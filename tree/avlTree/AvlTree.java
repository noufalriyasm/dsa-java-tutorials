package tree.avlTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AvlTree {
    AvlNode root;

    public AvlTree() {
        this.root = null;
    }

    public void preOrderTraversal(AvlNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inOrderTraversal(AvlNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.println(node.value + " ");
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal(AvlNode node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.value + " ");
    }

    public void levelOrderTraversal(AvlNode node) {
        Queue<AvlNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            AvlNode currentNode = queue.remove();
            System.out.println(currentNode.value + " ");
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }

    public AvlNode searchMethod(AvlNode node, int value) {
        if (node == null) {
            System.out.println("value " + value + " not found in Bst");
            return null;
        } else if (node.value == value) {
            System.out.println("Value " + value + " found in Bst");
            return node;
        } else if (value < node.value) {
            return searchMethod(node.left, value);
        } else {
            return searchMethod(node.right, value);
        }

    }
}
