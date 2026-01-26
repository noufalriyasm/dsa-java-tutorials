package tree.binarySearchTree;

import tree.binaryTree.BinaryNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    public BinarySearchNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    private BinarySearchNode insert(BinarySearchNode currentNode, int value) {
        if (currentNode == null) {
            BinarySearchNode newNode = new BinarySearchNode();
            newNode.value = value;
            System.out.println("The value added successfully");
            return newNode;
        } else if (value <= currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = insert(currentNode.right, value);
            return currentNode;
        }
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public void preOrderTraversal(BinarySearchNode node) {
        if (node == null) {
            return;
        } else {
            System.out.print(node.value + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void inOrderTraversal(BinarySearchNode node) {
        if (node == null) {
            return;
        } else {
            inOrderTraversal(node.left);
            System.out.print(node.value + " ");
            inOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(BinarySearchNode node) {
        if (node == null) {
            return;
        } else {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.value + " ");
        }
    }

    public void levelOrderTraversal() {
        Queue<BinarySearchNode> queue = new LinkedList<BinarySearchNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinarySearchNode currentNode = queue.remove();
            System.out.print(currentNode.value + " ");
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }

    public BinarySearchNode search(BinarySearchNode node, int value) {
        if (node == null) {
            System.out.println("the value " + value + " not found in bst");
            return null;
        } else if (node.value == value) {
            System.out.println("The value " + value + " found");
            return node;
        } else if (value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    public static BinarySearchNode minimumNode(BinarySearchNode root) {
        if (root.left == null) {
            return null;
        } else {
            return minimumNode(root.left);
        }
    }

    public BinarySearchNode deleteNode(BinarySearchNode root, int value) {
        if (root == null) {
            System.out.println("value not found in Bst");
            return null;
        }
        if (value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            if (root.left != null && root.right != null) {
                BinarySearchNode tempNode = root;
                BinarySearchNode minimumNodeForRight = minimumNode(tempNode.right);
                root.value = minimumNodeForRight.value;
                root.right = deleteNode(root.right, minimumNodeForRight.value);
            } else if (root.left != null) {
                root = root.left;
            } else if (root.right != null) {
                root = root.right;
            } else {
                root = null;
            }
        }
        return root;
    }
}
