package arrays.sorting.typesofsorting;

import java.util.Arrays;

public class SelectSorting {
    private int numberOfComparison;
    private int numberOfSwaps;
    private int[] arrayToSort;

    public SelectSorting(int[] arrayToSort) {
        this.arrayToSort = arrayToSort;
    }

    public void sortAndDisplayResults() {
        sort();
        displayResults();
    }

    private void sort() {
        int arrayToSortLength = arrayToSort.length;

        for (int i = 0; i < arrayToSortLength - 1; i++) {
            int indexOfMinElement = i;

            for (int j = i + 1; j < arrayToSortLength; j++) {
                numberOfComparison++;
                if (arrayToSort[j] < arrayToSort[indexOfMinElement]) {
                    indexOfMinElement = j;
                }
            }

            // if to uncomment this if statement, the number of swaps
            // can be less because of the case when indexOfMinElement remains the same (indexOfMinElement == i)
            // if (indexOfMinElement != i) {
            numberOfSwaps++;
            int smallerElem = arrayToSort[indexOfMinElement];
            arrayToSort[indexOfMinElement] = arrayToSort[i];
            arrayToSort[i] = smallerElem;
            //  }
        }
    }

    private void displayResults() {
        System.out.println();
        System.out.println("Select arrays.sorting: number of comparison = " + numberOfComparison + "   number of swaps = " + numberOfSwaps);
        Arrays.stream(arrayToSort).forEach(element -> System.out.print(element + ", "));
        System.out.println();
        System.out.println();
    }
}


