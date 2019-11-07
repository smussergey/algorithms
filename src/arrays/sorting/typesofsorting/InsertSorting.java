package arrays.sorting.typesofsorting;

import java.util.Arrays;

public class InsertSorting {
    private int numberOfComparison;
    private int numberOfSwaps;
    private int[] arrayToSort;

    public InsertSorting(int[] arrayToSort) {
        this.arrayToSort = arrayToSort;
    }

    public void sortAndDisplayResults() {
        sort();
        displayResults();
    }

    private void sort() {
        int arrayToSortLength = arrayToSort.length;
        for (int i = 1; i < arrayToSortLength; i++) {
            int elemToInsert = arrayToSort[i];
            int j = i;

            while (j > 0 && arrayToSort[j - 1] >= elemToInsert) {
                numberOfComparison++;
                arrayToSort[j] = arrayToSort[j - 1];
                --j;
            }
            numberOfSwaps++;
            arrayToSort[j] = elemToInsert;
        }
    }

    private void displayResults() {
        System.out.println();
        System.out.println("Insert arrays.sorting: number of comparison = " + numberOfComparison + "   number of swaps = " + numberOfSwaps);
        Arrays.stream(arrayToSort).forEach(element -> System.out.print(element + ", "));
        System.out.println();
        System.out.println();
    }
}
