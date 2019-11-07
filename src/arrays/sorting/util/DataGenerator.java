package arrays.sorting.util;

import java.util.concurrent.ThreadLocalRandom;

public class DataGenerator {

    public static int[] generateArray(int numberOfElements, int maxValueExclusive) {
        int[] generatedArray = new int[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            generatedArray[i] = ThreadLocalRandom.current().nextInt(maxValueExclusive);
        }
        return generatedArray;
    }
}
