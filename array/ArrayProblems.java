package array;

import java.util.Arrays;

public class ArrayProblems {
    /*
    Write a function called middle that takes an array and returns a
    new array that contains all but the first and last elements.
    myArray = [1, 2, 3, 4]
     middle(myArray)  # [2,3].
     */

    //Static method means we can call it without creating an object.
    public static int[] middle(int[] array) {
        if (array == null || array.length <= 2) {
            return new int[0];
        }
        int[] newArray = new int[array.length - 2];
        for (int i = 1; i < array.length - 1; i++) {
            newArray[i - 1] = array[i];
        }
        return newArray;
    }

    /*
    Given 2D array calculate the sum of diagonal elements.
    myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
    sumDiagonalElements(myArray2D) # 15
     */

    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                if (row == col) {
                    sum = sum + array[row][col];
                }
            }
        }
        return sum;
    }

    /*
    Given an array, write a function to get first, second best scores from the array and return it in new array.
    Array may contain duplicates.
    myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
    firstSecond(myArray) // {90, 87}
     */

    public static int[] firstSecond(int[] arrays) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int score : arrays) {
            if (score > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;
            } else if (score > secondHighest && score < firstHighest) {
                secondHighest = score;
            }
        }
        return new int[]{firstHighest, secondHighest};
    }

    /*
    Write Java function called findMissingNumberInArray that takes an integer array containing n-1
    unique elements from a range of 1 to n, with one missing number, and returns the missing number.
    myArray = {1,2,3,4,6}
    findMissingNumberInArray(myArray, 6) // 5
     */

    public static double findMissingNumberInAnArray(int[] array) {
        double sumOfGivenArrayNumbers = 0;
        int lengthOfArray = array.length + 1; // because array missing one number ,so +1 gives the original length;
        double actualSum = (double) (lengthOfArray * (lengthOfArray + 1)) / 2;  //n(n+1)/2
        for (int num : array) {
            sumOfGivenArrayNumbers = sumOfGivenArrayNumbers + num;

        }

        return actualSum - sumOfGivenArrayNumbers;
    }

    /*
    Write a function which takes integer array as a parameter and returns
    a new integer array with unique elements. (remove duplicates)
    removeDuplicates({1, 1, 2, 2, 3, 4, 5})
    Output : [1, 2, 3, 4, 5]
     */

    public static int[] removeDuplicates(int[] array) {
        int[] uniqueArray = new int[array.length];
        int index = 0;

        for (int value : array) {
            boolean isExist = false;
            for (int j = 0; j < index; j++) {
                if (uniqueArray[j] == value) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                uniqueArray[index++] = value;
//                index=index+1;
            }
        }
        return Arrays.copyOf(uniqueArray, index);
    }


    /*
    Given a sorted array nums, remove the duplicates in-place such that each
    element appears only once and returns the new length. Do not allocate extra
    space for another array; you must do this by modifying the input array in-place with O(1) extra memory

    Input: nums = [1, 1, 2]
    Output: 2
     */

    public static int removeDuplicatesFromSortedArray(int[] numbs) {
        if (numbs == null || numbs.length <= 0) {
            return 0;
        }
        int index = 0;
        for (int j = 1; j < numbs.length; j++) {
            if (numbs[j] != numbs[index]) {
                index++;
                numbs[index] = numbs[j];

            }
        }
        return index + 1;
    }

    /*
    You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize
    your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
     Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

     Input: prices = [7, 1, 5, 3, 6, 4]
     Output: 5
     Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
     */

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minValue) {
                minValue = price;
            } else if (price - minValue > maxProfit) {
                maxProfit = price - minValue;
            }
        }
        return maxProfit;
    }

    /*
    Given an array of integers numbs and an integer target, return indices of the two numbers such that they add up
    to target. You may assume that each input would have exactly one solution,
     and you may not use the same element twice.
     Input: numbs = [2,7,11,15], target = 9
    Output: [0,1]
    Output: Because numbs[0] + numbs[1] == 9, we return [0, 1]

    Input: numbs = [3,2,4], target = 6
    Output: [1,2]
     */

    public static int[] twoSum(int[] numbs, int target) {
        for (int i = 0; i < numbs.length; i++) {
            for (int j = i + 1; j < numbs.length; j++) {
                if (numbs[i] + numbs[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("not found the result");
    }

    /*
    Write a program to to check if an array contains a number in Java.
    int[] intArray = {1,2,3,4,5,6};
    searchInArray(intArray, 6); // 5
     */

    public static int searchInArray(int[] intArray, int valueToSearch) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == valueToSearch) {
                return i;
            }
        }
        throw new IllegalArgumentException("Value not found");
    }

    /*
    How to find maximum product of two integers in the array where all elements are positive.
    Example
    int[] intArray = {10,20,30,40,50};
    maxProduct(intArray) // (40,50)
     */

    public static String maxProduct(int[] intArray) {
        int maxProductValue = 0;
        String pairValues = "";
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] * intArray[j] > maxProductValue) {
                    maxProductValue = intArray[i] * intArray[j];
                    pairValues = "(" + Integer.toString(intArray[i]) + "," + Integer.toString(intArray[j]) + ")";
                }
            }
        }
        return pairValues;
    }

    /*
    Write a program to check if an array is unique or not.
    Example
    int[] intArray = {1,2,3,4,5,6};
    isUnique(intArray) // true
     */

    public static boolean isUnique(int[] intArray) {
        boolean isUnique = true;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] == intArray[j]) {
                    isUnique = false;
                    break;
                }
            }
        }
        return isUnique;
    }

    /*
    Your are given two integer arrays. Write a program to check if they are permutation of each other.
    Example
    int[] array1 = {1,2,3,4,5};
    int[] array2 = {5,1,2,3,4};
    permutation(array1, array2)
    Output-true
     */

    public static boolean permutation(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        int sum1 = 0;
        int sum2 = 0;
        int mul1 = 1;
        int mul2 = 1;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
            mul1 *= array1[i];
            mul2 *= array2[i];
        }
        return sum1 == sum2 && mul1 == mul2;
    }

    /*
    reversing an array
     */
    public static int[] reversingAnArray(int[] array){
        for(int i=0;i<array.length/2;i++){
            int reverseIndex=array.length-i-1;
            int tempValue=array[i];
            array[i]=array[reverseIndex];
            array[reverseIndex]=tempValue;
        }
        return array;
    }
}
