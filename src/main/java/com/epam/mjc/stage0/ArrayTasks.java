package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String [] seasons = {"winter", "spring", "summer", "autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int [] number = new int [6];
        int i = 1;
        for (int j = 0; j<length; j++){
            number[j] = i;
            i++;
        }

    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);

    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        if (number <= arr.length){
            for (int i = 0; i < arr.length; i++){
                if(arr[i] == number){
                    return i;
                    break;
                }
            }
        } else {
            return -1;
        }

    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String temp;                                                                    //for temporary word
        for (int i = arr.length-1, j = 0; j<i; i--, j++){
            temp = arr[i];                                                              // last -> temp
            arr[i] = arr[j];                                                            // frirst -> last,
            arr[j]=temp;
        }
        return arr;

    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int [] positive = new int[arr.length];
        int number = 0;                                             //number of element new array

        for (int i =0; i< arr.length; i++){
            if (arr[i]>0){
                positive[number] = arr[i];
            }
        }
        return positive;

    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        int [][] sorted;

        boolean iSorted = false;
        while (!iSorted) {
            iSorted = true;

            for (int i = 1; i <= arr.length; i++) {                 //sorted 1st

                boolean jSorted = false;                          // condition for check array sorted
                while (!jSorted) {
                    jSorted = true;
                    for (int j = 1; j <= arr[i].length; j++) {          //sort 2nd

                        if (j < j - 1) {
                            int temp = arr[i][j];
                            arr[i][j] = arr[i][j - 1];
                            arr[i][j - 1] = temp;

                            jSorted = false;
                        }

                    }
                }

                if (i < i - 1) {
                    int temp2 = arr[i][];
                    arr[i] = arr[i - 1][];
                    arr[i - 1][] = temp2;

                    iSorted = false;
                }
            }
        }

    }
}
