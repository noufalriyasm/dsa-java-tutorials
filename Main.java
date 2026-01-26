import queue.CircularQueue;
import queue.QueueArray;
import queue.QueueLinkedList;
import stack.Stack;
import stack.StackUsingLinkedList;
import tree.TreeNode;
import tree.binarySearchTree.BinarySearchTree;
import tree.binaryTree.BinaryNode;
import tree.binaryTree.BinaryTreeArray;
import tree.binaryTree.BinaryTreeLinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        TwoDimensionalArray twoDimensionalArray=new TwoDimensionalArray(3,3);
//        System.out.println(Arrays.deepToString(twoDimensionalArray.arr));
//        twoDimensionalArray.insertingElementToArray(2,2,5);
//        System.out.println(Arrays.deepToString(twoDimensionalArray.arr));
//
//        twoDimensionalArray.traversing2DArray();
//        twoDimensionalArray.searchingAValueInArray(5);
//
         /*
         finding average and highest temperature problem
          */
//        AverageTemperature averageTemperature=new AverageTemperature();

        /*
        dsa problems using arrays
         */
//        ArrayProblems arrayProblems=new ArrayProblems();
//        int[] array=ArrayProblems.middle(new int[]{10,50, 20, 30, 50,100,500}); // middle is a static method
//        System.out.println(Arrays.toString(array));
//
//        int sum=ArrayProblems.sumDiagonalElements(new int[][]{{10,30},{20,50}});
//        System.out.println(sum);
//
//        int[] firstSecondArray=ArrayProblems.firstSecond(new int[]{84,85,86,87,85,90,85,83,23,45,84,1,2,0});
//        System.out.println(Arrays.toString(firstSecondArray));
//
//        double missingNumber=ArrayProblems.findMissingNumberInAnArray(new int[]{1,2,3,4,6,7,8,9,10});
//        System.out.println(missingNumber);
//
//        int[] uniqueElements=ArrayProblems.removeDuplicates(new int[]{1, 1, 2, 2, 3, 4, 5});
//        System.out.println(Arrays.toString(uniqueElements));
//
//        int lengthOfArray=ArrayProblems.removeDuplicatesFromSortedArray(new int[]{1,1,2,2,2,3,3,4});
//        System.out.println(lengthOfArray);
//
//        int maxProfit=ArrayProblems.maxProfit(new int[]{7,1,5,3,6,4});
//        System.out.println(maxProfit);
//
//        int[] indexArray=ArrayProblems.twoSum(new int[]{2,7,11,15},9);
//        System.out.println(Arrays.toString(indexArray));
//
//        int indexOfSearchValue=ArrayProblems.searchInArray(new int[]{1,2,3,4,5,6},5);
//        System.out.println(indexOfSearchValue);
//
//        String maxProductValues=ArrayProblems.maxProduct(new int[]{10,20,30,40,50});
//        System.out.println(maxProductValues);
//
//        boolean isUnique=ArrayProblems.isUnique(new int[]{1,2,3,4,5,6,5});
//        System.out.println(isUnique);
//
//        boolean isPermutation=ArrayProblems.permutation(new int[]{1,2,3,4,5},new int[]{1,3,4,2,5});
//        System.out.println(isPermutation);
//
//        int[] reverseArray = ArrayProblems.reversingAnArray(new int[]{1, 2, 3, 4, 5});
//        System.out.println(Arrays.toString(reverseArray));


        /*
        dsa problems using arrayList and arrayList operations;
         */
//        ArrayListProblems arrayListProblems=new ArrayListProblems();
//        ArrayList<Integer> numbers = ArrayListProblems.numbers;
//        numbers.add(10);
//        System.out.println(numbers);
//
//        ArrayListProblems.numberListForLoop();
//        ArrayListProblems.fruitsForLoop();
//
//        ArrayListProblems.numbersForEachLoop();
//        ArrayListProblems.fruitsForEachLoop();
//
//        ArrayListProblems.numbersIteratorMethod();
//        ArrayListProblems.fruitsIteratorMethod();
//
//        ArrayList<String> list = ArrayListProblems.pairOfElements(new int[]{1, 3, 4, 5});
//        System.out.println(list);


        /*
        Singly Linked list operations
         */
//        SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
//        singlyLinkedList.createSinglyLinkedList(10);
//        System.out.println(singlyLinkedList.head.value);
//        singlyLinkedList.insertInLinkedList(5,1);
//        singlyLinkedList.insertInLinkedList(25,2);
//        singlyLinkedList.insertInLinkedList(30,0);
//        System.out.println(singlyLinkedList.head.next.value);
//
//        singlyLinkedList.traversingSinglyLinkedList();
//        singlyLinkedList.searchingValueInSinglyLinkedList(30);
//
//        singlyLinkedList.deletionOfNode(2);
//        singlyLinkedList.deleteSinglyLinkedList();
//        singlyLinkedList.traversingSinglyLinkedList();

        /*
        Singly linked list exercises
         */

//        SinglyLinkedListProblems singlyLinkedListProblems=new SinglyLinkedListProblems();
//        singlyLinkedListProblems.push(5);
//        System.out.println(singlyLinkedListProblems.head.value);
//        System.out.println(singlyLinkedListProblems.tail.value);
//        singlyLinkedListProblems.push(10);
//        System.out.println(singlyLinkedListProblems.size);
//        System.out.println(singlyLinkedListProblems.head.next.value);
//        System.out.println(singlyLinkedListProblems.tail.value);

        /*
        circular singly linked list operations;
         */
//        CircularSinglyLinkedList circularSinglyLinkedList=new CircularSinglyLinkedList();
//        circularSinglyLinkedList.createCircularSinglyLinkedList(5);
//        circularSinglyLinkedList.insertionInCircularSll(3,0);
//        System.out.println(circularSinglyLinkedList.head.value);
//        System.out.println(circularSinglyLinkedList.head.next.value);
//        circularSinglyLinkedList.traversingThroughCircularSll();
//        circularSinglyLinkedList.searchingForANodeValue(5);
//        circularSinglyLinkedList.deleteCircularSllNode(1);
//        circularSinglyLinkedList.traversingThroughCircularSll();
//        circularSinglyLinkedList.deleteCircularSll();
//        circularSinglyLinkedList.traversingThroughCircularSll();

        /**
         * Doubly linked list operations
         */
//        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
//        doublyLinkedList.createDoublyLinkedList(3);
//        System.out.println(doublyLinkedList.head.value);
//        doublyLinkedList.insertDoublyLinkedList(4,1);
//        doublyLinkedList.insertDoublyLinkedList(2,2);
//        doublyLinkedList.insertDoublyLinkedList(6,3);
//        doublyLinkedList.insertDoublyLinkedList(10,4);
//        doublyLinkedList.traversalOfDoublyLinkedList();
//        doublyLinkedList.reverseTraversalOfDll();
//        doublyLinkedList.searchingValueInDll(4);
//        doublyLinkedList.deletionInDll(0);
//        doublyLinkedList.traversalOfDoublyLinkedList();
//        doublyLinkedList.deleteEntireDll();
//        doublyLinkedList.traversalOfDoublyLinkedList();

        /**
         * circular doubly linked list operations
         */
//        CircularDoublyLinkedList cdll=new CircularDoublyLinkedList();
//        cdll.createDoublyLinkedList(1);
//        System.out.println(cdll.head.prev.value);
//        cdll.insertionOfNodeInDll(5,1);
//        cdll.insertionOfNodeInDll(20,10);
//        System.out.println(cdll.head.next.value);
//        cdll.traversalOfCdll();
//        cdll.searchingOfValue(50);
//        cdll.deletionOfNodeInCdll(10);
//        cdll.traversalOfCdll();
//        cdll.deleteEntireCdll();
//        cdll.traversalOfCdll();

        /**
         * stack
         */

//        Stack stack=new Stack(4);
//        boolean isEmpty=stack.isEmpty();
//        System.out.println(isEmpty);
//        boolean isFull=stack.isFull();
//        System.out.println(isFull);
//        stack.push(5);
//        stack.push(10);
//        stack.push(20);
//        stack.push(50);
//        int popResult=stack.pop();
//        System.out.println(popResult);
//        stack.push(60);
//        System.out.println(Arrays.toString(stack.arr));

        /**
         * stack using linked list
         */

//        StackUsingLinkedList stackUsingLinkedList=new StackUsingLinkedList();
//
//        stackUsingLinkedList.push(10);
//        stackUsingLinkedList.push(20);
//        stackUsingLinkedList.push(30);
//        boolean isEmpty=stackUsingLinkedList.isEmpty();
//        System.out.println(isEmpty);
//
//        int popResult1= stackUsingLinkedList.pop();
//        System.out.println(popResult1);
//        int popResult2=stackUsingLinkedList.pop();
//        System.out.println(popResult2);

        /**
         * Queue using array
         */

//        QueueArray queueArray=new QueueArray(4);
//        boolean isFull=queueArray.isFull();
//        System.out.println(isFull);
//        queueArray.enQueue(5);
//        boolean isEmpty=queueArray.isEmpty();
//        System.out.println(isEmpty);
//        queueArray.enQueue(10);
//        queueArray.enQueue(15);
//        queueArray.enQueue(20);
//
//        int dequeueResult1=queueArray.deQueue();
//        System.out.println(dequeueResult1);
//        int dequeueResult2=queueArray.deQueue();
//        System.out.println(dequeueResult2);
//        int peekValue=queueArray.peek();
//        System.out.println(peekValue);
//        queueArray.deleteQue();
//        boolean isEmptyAfterDelete=queueArray.isEmpty();
//        System.out.println(isEmptyAfterDelete);

        /**
         * circular queue operations
         */
//        CircularQueue circularQueue=new CircularQueue(4);

        /**
         * Queue using linked list
         */
//        QueueLinkedList queueLinkedList=new QueueLinkedList();
//        System.out.println(queueLinkedList.list.head);

        /**
         * Tree
         */

//        TreeNode drinks = new TreeNode("Drinks");
//        TreeNode hot = new TreeNode("Hot");
//        TreeNode cold = new TreeNode("Cold");
//        TreeNode tea = new TreeNode("Tea");
//        TreeNode coffee = new TreeNode("Coffee");
//        TreeNode alcoholic = new TreeNode("Alcoholic");
//        TreeNode non_alcoholic = new TreeNode("Non-alcoholic");
//        TreeNode beer = new TreeNode("Beer");
//        TreeNode wine = new TreeNode("Wine");
//        TreeNode cola = new TreeNode("Cola");
//        TreeNode fanta = new TreeNode("Fanta");
//        TreeNode soda = new TreeNode("Soda");
//
//        drinks.addChildren(hot);
//        drinks.addChildren(cold);
//        hot.addChildren(tea);
//        hot.addChildren(coffee);
//        cold.addChildren(alcoholic);
//        cold.addChildren(non_alcoholic);
//        alcoholic.addChildren(beer);
//        alcoholic.addChildren(wine);
//        non_alcoholic.addChildren(cola);
//        non_alcoholic.addChildren(fanta);
//        non_alcoholic.addChildren(soda);
//
//        System.out.println(drinks.print(0));


        /**
         * Binary tree using linked list
         */
//        BinaryTreeLinkedList binaryTreeLinkedList=new BinaryTreeLinkedList();
//
//        BinaryNode N1=new BinaryNode();
//        N1.value="N1";
//
//        BinaryNode N2=new BinaryNode();
//        N2.value="N2";
//
//        BinaryNode N3=new BinaryNode();
//        N3.value="N3";
//
//        BinaryNode N4=new BinaryNode();
//        N4.value="N4";
//
//        BinaryNode N5=new BinaryNode();
//        N5.value="N5";
//
//        BinaryNode N6=new BinaryNode();
//        N6.value="N6";
//
//        BinaryNode N7=new BinaryNode();
//        N7.value="N7";
//
//        BinaryNode N8=new BinaryNode();
//        N8.value="N8";
//
//        BinaryNode N9=new BinaryNode();
//        N9.value="N9";
//
//        N1.left=N2;
//        N1.right=N3;
//
//        N2.left=N4;
//        N2.right=N5;
//
//        N3.left=N6;
//        N3.right=N7;
//
//        N4.left=N8;
//        N4.right=N9;
//
//
//        binaryTreeLinkedList.root=N1;

//        binaryTreeLinkedList.preOrderBinaryTree(binaryTreeLinkedList.root);
//        binaryTreeLinkedList.inOrderBinaryTreeTraversal(binaryTreeLinkedList.root);
//        binaryTreeLinkedList.postOrderBinaryTreeTraversal(binaryTreeLinkedList.root);
//        binaryTreeLinkedList.levelOrderBinaryTreeTraversal(binaryTreeLinkedList.root);
//        binaryTreeLinkedList.searchInBinaryTree("N1");
//        binaryTreeLinkedList.insertNode("N10");
//        binaryTreeLinkedList.levelOrderBinaryTreeTraversal(binaryTreeLinkedList.root);
//        BinaryNode deepestNode=binaryTreeLinkedList.getDeepestNode();
//        System.out.println();
//        System.out.println(deepestNode.value);
//
//        binaryTreeLinkedList.deleteGivenNode("N10");
//        binaryTreeLinkedList.levelOrderBinaryTreeTraversal(binaryTreeLinkedList.root);


        /**
         * Binary tree using array
         */

//        BinaryTreeArray binaryTreeArray=new BinaryTreeArray(5);
//        binaryTreeArray.insert("N1");
//        binaryTreeArray.insert("N2");
//        binaryTreeArray.insert("N3");
//        binaryTreeArray.insert("N4");
//        binaryTreeArray.insert("N5");
//
//        binaryTreeArray.preOrderTraversal(1);

        /**
         * Binary search tree
         */

        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.insert(70);
        binarySearchTree.insert(50);
        binarySearchTree.insert(90);
        binarySearchTree.insert(30);
        binarySearchTree.insert(60);
        binarySearchTree.insert(80);
        binarySearchTree.insert(100);
        binarySearchTree.insert(20);
        binarySearchTree.insert(40);
        binarySearchTree.insert(10);

//        binarySearchTree.preOrderTraversal(binarySearchTree.root);
//        binarySearchTree.inOrderTraversal(binarySearchTree.root);
//        binarySearchTree.postOrderTraversal(binarySearchTree.root);
        binarySearchTree.levelOrderTraversal();
    }


}
