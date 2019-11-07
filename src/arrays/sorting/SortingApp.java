package arrays.sorting;

import arrays.sorting.typesofsorting.BubbleSorting;
import arrays.sorting.typesofsorting.InsertSorting;
import arrays.sorting.typesofsorting.SelectSorting;
import arrays.sorting.util.DataGenerator;

import java.util.Arrays;

public class SortingApp {
    public static void main(String[] args) {
        int[] arrayToSort = DataGenerator.generateArray(10, 90);

        System.out.println("Unsorted array: ");
        printArray(arrayToSort);

        BubbleSorting bubbleSorting = new BubbleSorting(Arrays.copyOf(arrayToSort, arrayToSort.length));
        bubbleSorting.sortAndDisplayResults();

        SelectSorting selectSorting = new SelectSorting(Arrays.copyOf(arrayToSort, arrayToSort.length));
        selectSorting.sortAndDisplayResults();

        InsertSorting insertSorting = new InsertSorting(Arrays.copyOf(arrayToSort, arrayToSort.length));
        insertSorting.sortAndDisplayResults();

        System.out.println("Unsorted array: ");
        printArray(arrayToSort);
    }

    private static void printArray(int[] arr) {
        Arrays.stream(arr).forEach(element -> System.out.print(element + ", "));
        System.out.println();
    }
}
