package arrays;

public class FirstDuplicateValue {

    // O(n) time complexity and O(1) space complexity
    public static int firstDuplicateValue(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            int mappedIdx = Math.abs(array[i]) - 1;
            if (array[mappedIdx] < 0) {
                return Math.abs(array[i]);
            } else {
                array[mappedIdx] = array[mappedIdx] * -1;
            }
        }
        return -1;
    }
}
