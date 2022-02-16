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

    public static void main(String[] args) {
        int[] array = new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        System.out.println(MonotonicArray.isMonotonic(array));

        array = new int[] {1, 5, 10, 1100, 1101, 1102, 9001};
        System.out.println(MonotonicArray.isMonotonic(array));

        array = new int[] {};
        System.out.println(MonotonicArray.isMonotonic(array));
    }
}