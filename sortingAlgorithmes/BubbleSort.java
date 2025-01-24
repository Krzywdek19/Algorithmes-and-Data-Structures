package org.example.sortingAlgorithmes;

public class BubbleSort implements SortingAlgorithm {
    public void sort(int[] arr){
        boolean isSorted;
        for(int i = 0; i < arr.length - 1; i++){
            isSorted = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1] ){
                    SortingUtils.swap(arr, j, j+1);
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
        }
    }
}
