package arrays;

public class MonotonicArray {

    public static boolean isMonotonic(int[] array) {
        boolean isMonotonicallyIncreasing = true;
        boolean isMonotonicallyDecreasing = true;

        for (int i = 0; i < array.length - 1; ++i) {

            if (array[i] < array[i + 1]) {
                isMonotonicallyDecreasing = false;
            }

            if (array[i] > array[i + 1]) {
                isMonotonicallyIncreasing = false;
            }
        }
        return isMonotonicallyIncreasing || isMonotonicallyDecreasing;
    }
}