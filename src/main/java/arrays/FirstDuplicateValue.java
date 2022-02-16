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

    public static void main(String[] args) {
        int[] array = new int[] {2, 1, 5, 2, 3, 3, 4};
        System.out.println(FirstDuplicateValue.firstDuplicateValue(array));

        array = new int[] {2, 1, 5, 3, 3, 2, 4};
        System.out.println(FirstDuplicateValue.firstDuplicateValue(array));

        array = new int[] {1, 1, 2, 3, 3, 2, 2};
        System.out.println(FirstDuplicateValue.firstDuplicateValue(array));
    }
}
