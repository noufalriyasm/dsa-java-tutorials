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

    public int getHeight(AvlNode node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    public AvlNode rotateRight(AvlNode disbalancedNode) {
        AvlNode newRoot = disbalancedNode.left;
        disbalancedNode.left = disbalancedNode.left.right;
        newRoot.right = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    public AvlNode rotateLeft(AvlNode disbalancedNode) {
        AvlNode newRoot = disbalancedNode.right;
        disbalancedNode.right = disbalancedNode.right.left;
        newRoot.left = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    public int getBalance(AvlNode node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    private AvlNode insertNode(AvlNode node, int nodeValue) {
        if (node == null) {
            AvlNode newNode = new AvlNode();
            newNode.value = nodeValue;
            newNode.height = 1;
            return newNode;
        } else if (nodeValue < node.value) {
            node.left = insertNode(node.left, nodeValue);

        } else {
            node.right = insertNode(node.right, nodeValue);

        }

        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        int balance = getBalance(node);

        if (balance > 1 && nodeValue < node.left.value) {
            return rotateRight(node);

        }
        if (balance > 1 && nodeValue > node.left.value) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if (balance < -1 && nodeValue > node.right.value) {
            return rotateLeft(node);
        }
        if (balance < -1 && nodeValue < node.right.value) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;

    }

    public void insert(int value) {
        root = insertNode(root, value);
    }

}
