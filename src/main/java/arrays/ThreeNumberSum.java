package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        int left;
        int right;
        int currentSum;
        List<Integer[]> triplets = new ArrayList<>();

        Arrays.sort(array);
        for (int i = 0; i < array.length - 2; ++i) {
            left = i + 1;
            right = array.length - 1;
            while (left < right) {
                currentSum = array[i] + array[left] + array[right];
                if (targetSum == currentSum) {
                    triplets.add(new Integer[] {array[i], array[left], array[right]});
                    ++left;
                    --right;
                } else if (targetSum > currentSum) {
                    ++left;
                } else {
                    --right;
                }
            }
        }

        return triplets;
    }
}
