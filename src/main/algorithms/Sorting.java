package main.algorithms;

public class Sorting {


    //100k integers: 14.3S
    /**
     * Time Complexity: O(log n^2)
     * **/
    public static void bubbleSort(int[] numberArray) {

        /* First Way: 18s
        boolean swappedSomething = true;
        while (swappedSomething) {

            swappedSomething = false;

            for (int i = 0; i < numberArray.length - 1; i++) {
                if (numberArray[i] > numberArray[i+1]) {
                    swappedSomething = true;
                    int temp = numberArray[i];
                    numberArray[i] = numberArray[i + 1];
                    numberArray[i + 1] = temp;
                }
            }
        }*/

        // Second Way: 14.3S
        for (int i = 0; i < numberArray.length - 1; i++) {
            for (int j = 0; j < numberArray.length - i - 1; j++) {
                if (numberArray[j] > numberArray[j + 1]) {

                    //Swapping
                    int temp = numberArray[j];
                    numberArray[j] = numberArray[j + 1];
                    numberArray[j + 1] = temp;
                }
            }
        }

    }

    /* **************************************************************************** */

    //100k integers: 4s
    /**
     * Time Complexity: O(log n^2)
     * **/
    public static void selectionSort(int[] numberArray){

        for (int i = 0; i < numberArray.length - 1; i++) {
            int minIndex = i;

            for(int j = i + 1; j < numberArray.length; j++){
                if(numberArray[j] < numberArray[minIndex]){
                    minIndex = j;
                }
            }

            //Swapping
            int temp = numberArray[i];
            numberArray[i] = numberArray[minIndex];
            numberArray[minIndex] = temp;
        }
    }

    /* **************************************************************************** */

    /**
     * Time Complexity: O(log n^2)
     * **/
    public static void insertionSort(int[] numberArray){

    }

    /* **************************************************************************** */

    /**
     * Time Complexity: O(n log n)
     * **/
    public static void quickSort(int[] numberArray){

    }

    /* **************************************************************************** */

    /**
     * Time Complexity: O(n log n)
     * **/
    public static void mergeSort(int[] numberArray){

    }
}
