package org.example.sortingAlgorithmes;

public class SortingComparator {
    public static void main(String[] args) {
        SortingUtils.sortAndMeasureTimeWithoutPrint(SortingUtils.generateArrayWithRandomNumbers(400, 100), new BubbleSort());
        SortingUtils.sortAndMeasureTimeWithoutPrint(SortingUtils.generateArrayWithRandomNumbers(400, 100), new InsertionSort());
        SortingUtils.sortAndMeasureTimeWithoutPrint(SortingUtils.generateArrayWithRandomNumbers(400, 100), new SelectionSort());
    }
}
