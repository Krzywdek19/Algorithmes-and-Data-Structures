package org.example.sortingAlgorithmes;

public class SelectionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] arr) {
        int minimalIndex;
        for (int i = 0; i < arr.length; i++) {
            minimalIndex = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] < arr[minimalIndex]) {
                    minimalIndex = j;
                }
            }
            if(minimalIndex != i) {
                SortingUtils.swap(arr, i, minimalIndex);
            }
        }
    }
}
