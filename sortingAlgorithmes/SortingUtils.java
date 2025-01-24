package org.example.sortingAlgorithmes;

import java.util.Random;

public class SortingUtils {
    private static final Random random = new Random();

    public static void swap(int [] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] generateArrayWithRandomNumbers(int n, int bound){
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = random.nextInt(bound);
        }
        return arr;
    }

    public static void sortAndMeasureTime(int [] arr, SortingAlgorithm sortingAlgorithm){
        System.out.println("Unsorted:");
        printArray(arr);
        long startTime = System.nanoTime();
        sortingAlgorithm.sort(arr);
        long time = System.nanoTime() - startTime;
        System.out.println("Sorted: ");
        printArray(arr);
        System.out.println("Elapsed time: " + (double)time/1000000 + "ms");
    }

    public static void sortAndMeasureTimeWithoutPrint(int [] arr, SortingAlgorithm sortingAlgorithm){
        long startTime = System.nanoTime();
        sortingAlgorithm.sort(arr);
        long time = System.nanoTime() - startTime;
        System.out.println(sortingAlgorithm.getClass().getSimpleName());
        System.out.println("Array is sorted: " + isSorted(arr,true));
        System.out.println("Elapsed time: " + (double)time/1000000 + "ms");
        System.out.println();
    }

    public static void printArray(int [] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(int [] arr, boolean incrementally){
        for(int i = 0; i < arr.length - 1; i++){
            if(incrementally){
                if(arr[i] > arr[i+1]){
                    return false;
                }
                if(arr[i] < arr[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
