package main.practice;

import main.algorithms.Sorting;

import java.util.Random;

public class SortingAlgorithms {

    public void sortStuff(){
        int[] numberArray = new int[100000];
        Random random = new Random();

        for (int i = 0; i < numberArray.length; i++){
            numberArray[i] = random.nextInt(100000);
        }

        //Before Sort
        System.out.println("Before Sort: ");
        printArray(numberArray);


        //Sorting
        long startTime = System.currentTimeMillis();
        Sorting.selectionSort(numberArray);
        long endTime = System.currentTimeMillis();

        //After Sort
        System.out.println();
        System.out.println("After Sort: ");
        printArray(numberArray);

        //Time Elapse
        System.out.println();
        System.out.println("Sorting Time: " + (endTime - startTime) + "ms");
    }

    private void printArray(int[] numberArray) {


        for (int i = 0; i < numberArray.length; i++){
            System.out.println(numberArray[i]);
        }
    }
}
