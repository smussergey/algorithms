package arrays.sorting.typesofsorting;

import java.util.Arrays;

public class BubbleSorting {
    private int numberOfComparison;
    private int numberOfSwaps;
    private int[] arrayToSort;

    public BubbleSorting(int[] arrayToSort) {
        this.arrayToSort = arrayToSort;
    }

    public void sortAndDisplayResults() {
        sort();
        displayResults();
    }

    private void sort() {
        int arrayToSortLength = arrayToSort.length;

        for (int i = arrayToSortLength - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                numberOfComparison++;
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    numberOfSwaps++;
                    int greaterElem = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = greaterElem;
                }
            }
        }
    }

    private void displayResults() {
        System.out.println();
        System.out.println("Bubble arrays.sorting: number of comparison = " + numberOfComparison + "   number of swaps = " + numberOfSwaps);
        Arrays.stream(arrayToSort).forEach(element -> System.out.print(element + ", "));
        System.out.println();
        System.out.println();
    }
}
