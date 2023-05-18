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
        return seasons;
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

            int[] number = new int[length];
            int i = 1;
            for (int j = 0; j < length; j++) {
                number[j] = i;
                i++;
            }
            return number;

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
        return sum;

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
        int index = -1;
        for (int i = 0; i < arr.length; i++){
                if(arr[i] == number){
                    index = i;
                    break;
                }
            }
        return index;
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
        int [] temp = new int[arr.length];                                //create temprary array
        int [] positive;
        int number = 0;
        int posArrLength = 0;                       //length of possitive array
        for (int i =0; i< arr.length; i++){
            if (arr[i]>0){

                temp[number] = arr[i];
                number++;
                posArrLength++;
            }

        }
        positive = new int[posArrLength];
        System.arraycopy(temp, 0, positive, 0, posArrLength);

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
 /*       int temp;                                           //for change elements
        int [] temprArray;                      // for change array

        for(int i = 0; i<arr.length; i++) {
            for (int j = 0; j<arr[i].length; j++) {
                if(j+1 < j){
                    temp = arr[i][j+1];                 //      \
                    arr[i][j+1] = arr[i][j];            //       > sorting second-dimentional array
                    arr[i][j] = temp;                   //      /
                }
            }

            if(i+1 < i){
                temprArray = arr[i+1];                  // sorted first-dimention array
                arr [i+1] = arr[i];
                arr[i] = temprArray;
            }
        }
        return arr;
    }
*/

        int[][] result = new int[arr.length][1];
        for (int i = 0; i < arr.length; i++) {
            result[i][0] = arr[i].length;
            for (int k = 0; k < arr[i].length; k++) {
                for (int j = k + 1; j < arr[i].length; j++) {
                    if (arr[i][k] > arr[i][j]) {
                        int tmp = arr[i][k];
                        arr[i][k] = arr[i][j];
                        arr[i][j] = tmp;
                    }
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i][0] > result[j][0]) {
                    int tmp = result[i][0];
                    result[i][0] = result[j][0];
                    result[j][0] = tmp;
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (result[i][0] == arr[j].length) {
                    result[i] = arr[j];
                    arr[j] = new int[0];
                    break;
                }
            }
        }
        return result;
    }

}
